package com.springbank.user.cmd.api.security;

/**
 * Created by aminebechraoui, on 05/03/2022, in com.springbank.user.cmd.api.security
 */
public interface PasswordEncoder {
    String hashPassword(String password);
}
