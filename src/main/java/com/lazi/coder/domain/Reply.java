package com.lazi.coder.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Reply {

    private String content;

    @CreatedBy
    private UserOAuthInfo createdBy;
}
