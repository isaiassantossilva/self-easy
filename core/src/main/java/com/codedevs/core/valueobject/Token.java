package com.codedevs.core.valueobject;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class Token {
    private String value;
    private LocalDateTime expireAt;

    public Token() {
        this.expireAt = LocalDateTime.now().plusDays(1);
        this.value = UUID.randomUUID().toString();
    }

    public boolean hasExpired() {
        return expireAt.isBefore(LocalDateTime.now());
    }

    public boolean notHasExpired() {
        return !hasExpired();
    }
}
