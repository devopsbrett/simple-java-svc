package io.contino.lse.pipeline.rest;

import io.contino.lse.pipeline.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRest {

    @RequestMapping(path = "/users/", method = RequestMethod.POST)
    public User getUser(@RequestBody User user) {
        return user;
    }
}