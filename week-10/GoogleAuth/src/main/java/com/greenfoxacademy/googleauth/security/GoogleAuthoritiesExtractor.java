package com.greenfoxacademy.googleauth.security;

import org.springframework.boot.autoconfigure.security.oauth2.resource.AuthoritiesExtractor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class GoogleAuthoritiesExtractor implements AuthoritiesExtractor {

  List<GrantedAuthority> GOOGLE_FREE_AUTHORITIES
      = AuthorityUtils.commaSeparatedStringToAuthorityList(
      "GOOGLE_USER,USER_ROLL");
  List<GrantedAuthority> NOT_GOOGLE_ACCOUNT
      = AuthorityUtils.commaSeparatedStringToAuthorityList(
      "Not a gmail account!");

  @Override
  public List<GrantedAuthority> extractAuthorities(Map<String, Object> map) {
    if (Objects.nonNull(map.get("authority"))) {
      if (!((LinkedHashMap) map.get("authority"))
          .get("email")
          .equals("gmail.com")) {
        return NOT_GOOGLE_ACCOUNT;
      }
    }
    return GOOGLE_FREE_AUTHORITIES;
  }
}
