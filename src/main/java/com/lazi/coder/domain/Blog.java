package com.lazi.coder.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@Data
public class Blog {
    @Id
    private UUID id;
    private String title;
    private String content;
    private Date createdDate;
    private Date updatedDate;
}
