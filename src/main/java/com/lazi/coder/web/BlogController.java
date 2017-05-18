package com.lazi.coder.web;

import com.lazi.coder.dao.BlogRepository;
import com.lazi.coder.dao.TagRepository;
import com.lazi.coder.domain.Blog;
import com.lazi.coder.domain.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("api/blog")
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private TagRepository tagRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Page<Blog> getAll(Pageable pageable) {
        return blogRepository.findAllByOrderByCreatedDateDesc(pageable);
    }

    @RequestMapping(value = "tags", method = RequestMethod.GET)
    public List<Tag> getTags() {
        return tagRepository.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Blog save(@RequestBody Blog blog) {
        return blogRepository.save(blog);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        blogRepository.delete(id);
    }

    @RequestMapping(value = "tag/{tag}", method = RequestMethod.GET)
    public Page<Blog> getAll(@PathVariable("tag") String tag, Pageable pageable) {
        List<String> tags = new ArrayList<>();
        tags.add(tag);
        return blogRepository.findByTagsNameIn(tags, pageable);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Blog getById(@PathVariable String id) {
        return blogRepository.findById(id);
    }

}