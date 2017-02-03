package com.lazi.coder.web;

import com.lazi.coder.dao.BlogRepository;
import com.lazi.coder.domain.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController1 {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    BlogRepository blogRepository;


    @RequestMapping("/greeting1")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            System.out.println(authentication);
        }

        return name;
    }

    @RequestMapping(value = "/greeting1", method = RequestMethod.POST)
    public Blog postBlog(@RequestParam(value = "name", defaultValue = "WorldPost") String name) {
        Blog blog = new Blog();
        blog.setContent("content");
        blog.setTitle(name);
        Blog dave = blogRepository.save(blog);
        return dave;
    }
}
