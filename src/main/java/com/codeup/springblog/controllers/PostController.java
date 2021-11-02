package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String indexPage() {
        return "All post";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String individualPost(@PathVariable long id) {
        return "Here is the post" + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String formPost() {
        return ;
    }

    @PostMapping("/post/create")
    @ResponseBody
    public String createPost() {
            return ;

    }
}
