package com.lazi.coder.dao;


import com.lazi.coder.domain.Blog;
import com.lazi.coder.domain.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface CommentRepository extends MongoRepository<Comment, String> {
}
