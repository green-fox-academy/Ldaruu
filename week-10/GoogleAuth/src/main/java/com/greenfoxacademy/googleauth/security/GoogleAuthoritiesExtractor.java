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
      "GOOGLE_USER,GITHUB_USER_FREE");
  List<GrantedAuthority> GOOGLE_SUBSCRIBED_AUTHORITIES
      = AuthorityUtils.commaSeparatedStringToAuthorityList(
      "GOOGLE_USER,GITHUB_USER_SUBSCRIBED");

  @Override
  public List<GrantedAuthority> extractAuthorities(Map<String, Object> map) {
    if (Objects.nonNull(map.get("plan"))) {
      if (!((LinkedHashMap) map.get("plan"))
          .get("email")
          .equals("gmail.com")) {
        return GOOGLE_SUBSCRIBED_AUTHORITIES;
      }
    }
    return GOOGLE_FREE_AUTHORITIES;
  }
}
