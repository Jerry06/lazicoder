package com.lazi.coder.dao;

import com.lazi.coder.LazicoderApplication;
import com.lazi.coder.domain.Blog;
import com.lazi.coder.domain.Category;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LazicoderApplication.class)
public class BlogRepositoryTest {

    @Autowired
    BlogRepository repository;

    Blog dave, oliver, carter;

    @Before
    public void setUp() {
        repository.deleteAll();
        for (int i = 0; i < 5; i++) {
            Blog blog = new Blog();
            //blog.setId(UUID.randomUUID());
            Category cat1 = new Category("cat1");
            blog.setCategory(cat1);
            blog.setContent("content");
            blog.setTitle("ttittt");
            dave = repository.save(blog);
        }
        for (int i = 0; i < 5; i++) {
            Blog blog = new Blog();
            //blog.setId(UUID.randomUUID());
            Category cat2 = new Category("cAt2");
            blog.setCategory(cat2);
            blog.setContent("content");
            blog.setTitle("ttittt");
            dave = repository.save(blog);
        }
//        List<Blog> all = repository.findAll();
//        System.out.println(all);
    }

    @Test
    public void setsIdOnSave() {
        PageRequest pageRequest = new PageRequest(1, 2);
        Page<Blog> rs = repository.findByCategory_nameIgnoreCase("CAT1", pageRequest);
        System.out.println(rs);
    }
}
