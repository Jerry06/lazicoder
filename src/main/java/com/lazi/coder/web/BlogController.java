package com.lazi.coder.web;

import com.lazi.coder.dao.BlogRepository;
import com.lazi.coder.domain.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Page<Blog> getAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

    @RequestMapping(value = "cat/{cat}", method = RequestMethod.GET)
    public Page<Blog> getAll(@PathVariable("cat") String category, Pageable pageable) {
        return blogRepository.findByCategory_nameIgnoreCase(category, pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Blog getById(@PathVariable String id) {
        return blogRepository.findById(id);
    }
}