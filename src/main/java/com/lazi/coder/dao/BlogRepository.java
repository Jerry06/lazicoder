package com.lazi.coder.dao;


import com.lazi.coder.domain.Blog;
import com.lazi.coder.domain.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface BlogRepository extends MongoRepository<Blog, String> {

    Page<Blog> findAll(Pageable pageable);

    Blog findById(String id);

    Page<Blog> findByCategory_nameIgnoreCase(String name, Pageable pageable);
}
