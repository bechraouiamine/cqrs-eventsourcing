package com.springbank.user.cmd.api.dto;

import com.springbank.user.core.dto.BaseResponse;

/**
 * Created by aminebechraoui, on 19/03/2022, in com.springbank.user.cmd.api.dto
 */
public class UpdateUserResponse extends BaseResponse {
    private String id;
    public UpdateUserResponse(String id, String safeErrorMessage) {
        super(safeErrorMessage);
        this.id = id;

    }
}
