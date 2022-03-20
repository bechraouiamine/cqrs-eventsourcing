package com.springbank.user.cmd.api.controllers;

import com.springbank.user.cmd.api.commands.UpdateUserCommand;
import com.springbank.user.core.dto.BaseResponse;
import com.springbank.user.cmd.api.dto.UpdateUserResponse;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by aminebechraoui, on 19/03/2022, in com.springbank.user.cmd.api.controllers
 */
@RestController
@RequestMapping(path = "api/v1/updateUser")
public class UpdateUserController {
    private final CommandGateway commandGateway;

    @Autowired
    public UpdateUserController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }
    
    @PutMapping(value="/{id}")
    public ResponseEntity<BaseResponse> updateUser(@PathVariable(value = "id") String id,
                                                   @Valid @RequestBody UpdateUserCommand command) {
        try {
            command.setId(id);
            commandGateway.sendAndWait(command);
            return new ResponseEntity<>(new UpdateUserResponse(id, "User successfully updated"),
                    HttpStatus.OK);
        } catch (Exception e) {
            var safeErrorMessage = "Error while processing update user request for id " + id;
            e.printStackTrace();
            return new ResponseEntity<>(new UpdateUserResponse(id, safeErrorMessage),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
