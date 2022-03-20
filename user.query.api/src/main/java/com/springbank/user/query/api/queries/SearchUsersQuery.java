package com.springbank.user.query.api.queries;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by aminebechraoui, on 19/03/2022, in com.springbank.user.query.api.queries
 */
@Data
@AllArgsConstructor
public class SearchUsersQuery {
    private String filter;
}
