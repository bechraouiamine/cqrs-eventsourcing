package com.springbank.user.query.api.repositories;

import com.springbank.user.core.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by aminebechraoui, on 05/03/2022, in com.springbank.user.query.api.repositories
 */
public interface UserRepository extends MongoRepository<User, String> {
}
