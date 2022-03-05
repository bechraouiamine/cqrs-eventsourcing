package com.springbank.user.core.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by aminebechraoui, on 05/03/2022, in com.springbank.user.core.models
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {
    @Size(min = 2, message = "username should have at least 2 characters")
    private String username;
    @Size(min = 2, message = "username should have at least 7 characters")
    private String password;
    @NotNull(message = "you should specify at least on role")
    private List<Role> roles;
}
