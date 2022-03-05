package com.springbank.user.core.events;

import com.springbank.user.core.models.User;
import lombok.Builder;
import lombok.Data;

/**
 * Created by aminebechraoui, on 05/03/2022, in com.springbank.user.core.events
 */
@Data
@Builder
public class UserUpdatedEvent {
    private String id;
    private User user;
}
