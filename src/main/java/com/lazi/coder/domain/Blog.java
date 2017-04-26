package com.lazi.coder.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Data
public class Blog {

    private String id;
    private String title;
    private String content;
    private String img;//will be base64 coder
    private List<Tag> tags;
    private List<Comment> comments;

    @CreatedDate
    private Date createdDate;

    @LastModifiedDate
    private Date lastModifiedDate;

}
