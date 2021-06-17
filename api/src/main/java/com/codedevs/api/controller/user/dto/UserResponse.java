package com.codedevs.api.controller.user.dto;

import com.codedevs.core.domain.User;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserResponse {
    private String id;
    private String email;

    public static UserResponse fromUser(User user){
        return UserResponse.builder()
                .id(user.getId())
                .email(user.getEmail())
                .build();
    }
}
