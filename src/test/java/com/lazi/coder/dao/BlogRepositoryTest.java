//package com.lazi.coder.dao;
//
//import com.lazi.coder.SocialApplication;
//import com.lazi.coder.domain.*;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SocialApplication.class)
//public class BlogRepositoryTest {
//
//    @Autowired
//    BlogRepository repository;
//
//    Blog dave, oliver, carter;
//
//    @Before
//    public void setUp() {
////        repository.deleteAll();
////        for (int i = 0; i < 5; i++) {
////            Blog blog = new Blog();
////            List<Tag> tags = new ArrayList<>();
////            tags.add(new Tag("lamda"));
////            tags.add(new Tag("java-8"));
////            //blog.setId(UUID.randomUUID());
////            blog.setSummary("Summary 111");
////            blog.setContent(UUID.randomUUID().toString());
////            blog.setTitle("java-8" + UUID.randomUUID().toString());
////            blog.setTags(tags);
////            List<Comment> commentList = new ArrayList<>();
////            Comment comment = new Comment();
////            comment.setContent("content1111");
////            commentList.add(comment);
////
////            Comment comment1 = new Comment();
////            comment1.setContent("content1111");
////            Reply reply = new Reply();
////            reply.setContent("reply1");
////            List<Reply> replies = new ArrayList<>();
////            replies.add(reply);
////            comment1.setReplies(replies);
////            commentList.add(comment1);
////
////            blog.setComments(commentList);
////            dave = repository.save(blog);
////        }
////        for (int i = 0; i < 5; i++) {
////            Blog blog = new Blog();
////            List<Tag> tags = new ArrayList<>();
////            tags.add(new Tag("java-9"));
////            blog.setTags(tags);
////            blog.setSummary("Summary 111");
////            blog.setContent(UUID.randomUUID().toString());
////            blog.setTitle("java-9" + UUID.randomUUID().toString());
////            dave = repository.save(blog);
////        }
////        List<String> list = new ArrayList<>();
////        list.add("java-8");
////        list.add("Java-9");
////        List<Blog> all = repository.findByTagsNameIn(list);
////        System.out.println(all);
//    }
//
//    @Test
//    public void setsIdOnSave() {
//        List<Blog> all = repository.findAll();
//        System.out.println(all);
////        PageRequest pageRequest = new PageRequest(1, 2);
////        Page<Blog> rs = repository.findByCategory_nameIgnoreCase("CAT1", pageRequest);
////        System.out.println(rs);
//    }
//}
