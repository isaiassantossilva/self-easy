package com.codedevs.core.domain;


import com.codedevs.core.enuns.Permission;
import com.codedevs.core.valueobject.Token;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@Builder
public class User {
    private String id;
    private String name;
    private String email;
    private String password;
    private Set<Permission> permission;
    private Token token;
}
