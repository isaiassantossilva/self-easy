package com.codedevs.security;

import com.codedevs.core.ports.driven.CryptPasswordPort;

import javax.inject.Named;

@Named
public class CryptPasswordAdapter implements CryptPasswordPort {
    @Override
    public String encodePassword(String raw) {
        return raw;
    }
}
