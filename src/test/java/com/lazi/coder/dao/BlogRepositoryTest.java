package com.lazi.coder.dao;

import com.lazi.coder.domain.Blog;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogRepositoryTest {

    @Autowired
    BlogRepository repository;

    Blog dave, oliver, carter;

    @Before
    public void setUp() {
        repository.deleteAll();
        Blog blog = new Blog();
        //blog.setId(UUID.randomUUID());
        blog.setContent("content");
        blog.setTitle("ttittt");
        dave = repository.save(blog);
//        List<Blog> all = repository.findAll();
//        System.out.println(all);
    }

    @Test
    public void setsIdOnSave() {


    }
}
