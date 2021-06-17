package com.codedevs.api.controller.user.dto;

import com.codedevs.core.domain.User;
import lombok.Getter;

@Getter
public class UserRequest {

    private String name;
    private String email;
    private String password;

    public User toUser(){
        return User.builder()
                .name(name)
                .email(email)
                .password(password)
                .build();
    }
}
