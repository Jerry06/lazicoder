package com.lazi.coder.dao;

import com.lazi.coder.LazicoderApplication;
import com.lazi.coder.domain.Blog;
import com.lazi.coder.domain.Category;
import com.lazi.coder.domain.Tag;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LazicoderApplication.class)
public class CategoryRepositoryTest {

    @Autowired
    CategoryRepository repository;

    Blog dave, oliver, carter;

    @Before
    public void setUp() {
        repository.deleteAll();
        Category cat1 = new Category("Java");
        Category cat2 = new Category("Angular2");
        repository.save(cat1);
        repository.save(cat2);
    }

    @Test
    public void testA() {

    }
}
