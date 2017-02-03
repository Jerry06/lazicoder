package com.lazi.coder.domain;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Configuration
public class MyAppAuditor implements AuditorAware<String> {
//    @Override
//    public String getCurrentAuditor() {
//        return "Test123 Viet";
//    }

    @Override
    public String getCurrentAuditor() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            return null;
        }

        return "viet";
    }
}