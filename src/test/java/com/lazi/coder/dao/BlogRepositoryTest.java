package com.lazi.coder.dao;

import com.lazi.coder.LazicoderApplication;
import com.lazi.coder.domain.Blog;
import com.lazi.coder.domain.Category;
import com.lazi.coder.domain.Comment;
import com.lazi.coder.domain.Reply;
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
            Category cat1 = new Category("Angular2");
            blog.setCategory(cat1);
            blog.setContent(UUID.randomUUID().toString());
            blog.setTitle(UUID.randomUUID().toString());
            List<Comment> commentList = new ArrayList<>();
            Comment comment = new Comment();
            comment.setContent("content1111");
            commentList.add(comment);

            Comment comment1 = new Comment();
            comment1.setContent("content1111");
            Reply reply = new Reply();
            reply.setContent("reply1");
            List<Reply> replies = new ArrayList<>();
            replies.add(reply);
            comment1.setReplies(replies);
            commentList.add(comment1);

            blog.setComments(commentList);
            dave = repository.save(blog);
        }
        for (int i = 0; i < 5; i++) {
            Blog blog = new Blog();
            //blog.setId(UUID.randomUUID());
            Category cat2 = new Category("Java");
            blog.setCategory(cat2);
            blog.setContent(UUID.randomUUID().toString());
            blog.setTitle(UUID.randomUUID().toString());
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
