package com.springbank.user.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by aminebechraoui, on 05/03/2022, in com.springbank.user.cmd.api.dto
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse {
    private String message;
}
