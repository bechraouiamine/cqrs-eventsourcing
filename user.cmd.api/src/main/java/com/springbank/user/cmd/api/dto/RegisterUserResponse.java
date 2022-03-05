package com.springbank.user.cmd.api.dto;

/**
 * Created by aminebechraoui, on 05/03/2022, in com.springbank.user.cmd.api.dto
 */
public class RegisterUserResponse extends BaseResponse {

    private String id;
    public RegisterUserResponse(String message) {
        super(message);
    }
}
