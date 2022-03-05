package com.springbank.user.cmd.api.commands;

import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

/**
 * Created by aminebechraoui, on 05/03/2022, in com.springbank.user.cmd.api.commands
 */
@Data
public class RemoveUserCommand {
    @TargetAggregateIdentifier
    private String id;
}
