package com.greenfoxacademy.googleauth.security;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

import java.util.Map;

public class BaeldungPrincipalExtractor implements PrincipalExtractor {
 
    @Override
    public Object extractPrincipal(Map<String, Object> map) {
        return map.get("email");
    }
}