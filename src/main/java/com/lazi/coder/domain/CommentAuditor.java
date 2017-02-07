package com.lazi.coder.domain;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;

import java.util.Map;

@Configuration
public class CommentAuditor implements AuditorAware<UserOAuthInfo> {

    @Override
    public UserOAuthInfo getCurrentAuditor() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication != null && authentication.isAuthenticated()) {
            UserOAuthInfo userOAuthInfo = new UserOAuthInfo((Map<String, String>) ((OAuth2Authentication) authentication).getUserAuthentication().getDetails());
            userOAuthInfo.setTokenValue(((OAuth2AuthenticationDetails)authentication.getDetails()).getTokenValue());
            return userOAuthInfo;
        }

        return null;
    }
}