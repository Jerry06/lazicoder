package com.lazi.coder.dao;


import com.lazi.coder.domain.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BlogRepository extends MongoRepository<Blog, String> {

    Page<Blog> findAllByOrderByCreatedDateDesc(Pageable pageable);

    Blog findById(String id);


    Page<Blog> findByTagsNameIn(List<String> tags, Pageable pageable);

//    findByCategory_nameIgnoreCase

}
