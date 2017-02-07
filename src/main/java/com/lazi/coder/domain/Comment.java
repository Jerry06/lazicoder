package com.lazi.coder.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Comment {

    private String id;
    private String blogId;
    private List<Comment> childComments;

    @CreatedBy
    private UserOAuthInfo createdBy;
}
