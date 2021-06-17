package com.codedevs.api.controller.user;

import com.codedevs.api.controller.user.dto.UserRequest;
import com.codedevs.api.controller.user.dto.UserResponse;
import com.codedevs.core.ports.driven.UserRepositoryPort;
import com.codedevs.core.ports.driver.CreateNewUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final CreateNewUserPort createNewUserPort;
    private final UserRepositoryPort userRepositoryPort;

    @PostMapping
    public String createNewUser(@RequestBody UserRequest userRequest){
        return createNewUserPort.execute(userRequest.toUser()).getId();
    }

    @GetMapping
    public List<UserResponse> findAll(){
        return userRepositoryPort.findAll()
                .stream().map(user -> UserResponse.fromUser(user))
                .collect(Collectors.toList());
    }
}
