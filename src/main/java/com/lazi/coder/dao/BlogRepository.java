package com.lazi.coder.dao;


import com.lazi.coder.domain.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface BlogRepository extends MongoRepository<Blog, UUID> {
}
