package com.greenfoxacademy.googleauth.security;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

import java.util.Map;

public class GooglePrincipalExtractor  implements PrincipalExtractor {
  @Override
  public Object extractPrincipal(Map<String, Object> map) {
    return map.get("login");
  }
}
