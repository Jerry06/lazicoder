package com.lazi.coder.dao;

import com.lazi.coder.LazicoderApplication;
import com.lazi.coder.domain.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LazicoderApplication.class)
public class TagRepositoryTest {

    @Autowired
    TagRepository repository;

    Blog dave, oliver, carter;

    @Before
    public void setUp() {
        repository.deleteAll();
        String[] strs = {"java-8", "java-9", "lamda"};
        for (String str : strs) {
            Tag tag1 = new Tag(str);
            repository.save(tag1);
        }

    }

    @Test
    public void testA() {

    }
}
