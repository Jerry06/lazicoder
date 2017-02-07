package com.lazi.coder.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.Date;
import java.util.Map;

@NoArgsConstructor
@Data
public class UserOAuthInfo {

    private String id;
    private String userId;
    private String name;
    private String link;
    private String oauthProvider = "Facebook";
    private String tokenValue;

    public UserOAuthInfo(Map<String, String> details) {
        if (!CollectionUtils.isEmpty(details)){
            userId = details.get("id");
            name = details.get("name");
            link = details.get("link");
        }
    }
}
