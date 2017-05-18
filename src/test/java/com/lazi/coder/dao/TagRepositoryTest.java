package com.lazi.coder.dao;

import com.lazi.coder.SocialApplication;
import com.lazi.coder.domain.Blog;
import com.lazi.coder.domain.Tag;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SocialApplication.class)
public class TagRepositoryTest {

    @Autowired
    TagRepository repository;

    Blog dave, oliver, carter;

    @Before
    public void setUp() {
//        repository.deleteAll();
//        String[] strs = {"java","java-8", "java-9", "lamda"};
//        for (String str : strs) {
//            Tag tag1 = new Tag(str);
//            repository.save(tag1);
//        }

    }

    @Test
    public void testA() {

    }
}
