package com.lazi.coder.domain;

import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

public class UserOAuthInfo {

    private String id;
    private String userId;
    private String oauthProvider;
    private String accessToken;
    private Date expiredDate;
    @CreatedDate
    private Date createdDate;
}
