package com.springbank.user.core.models;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by aminebechraoui, on 05/03/2022, in com.springbank.user.core.models
 */
public enum Role implements GrantedAuthority {
    READ_PRIVILEGE, WRITE_PRIVILEGE;

    @Override
    public String getAuthority() {
        return name();
    }
}
