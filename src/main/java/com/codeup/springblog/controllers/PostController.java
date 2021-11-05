//package com.codeup.springblog.controllers;
//
//import com.codeup.springblog.models.Post;
//import com.codeup.springblog.repositories.PostRepository;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//public class PostController {
//
////    This is dependency injection
//    public PostController(PostRepository postsDao) {
//        this.postsDao = postsDao;
//    }
////    *********
//
//    private PostRepository postsDao;
//
//    @GetMapping("/posts")
////    @ResponseBody
//    public String indexPage() {
////        Will fetch all posts with potsDao
//        List<Post> posts = postsDao.findAll();
////        Send list of post objects to index view
////        add list of posts to
//        viewModel.addAttribute("posts", posts);
//        return "posts/index";
//    }
//
//    @GetMapping("/posts/{id}")
//    @ResponseBody
//    public String individualPost(@PathVariable long id) {
//        return "Here is the post" + id;
//    }
//
//    @GetMapping("/posts/create")
//    @ResponseBody
//    public String formPost() {
//        return "";
//    }
//
//    @PostMapping("/post/create")
//    @ResponseBody
//    public String createPost() {
//            return "";
//
//    }
//
//    @GetMapping("/posts/{id}/edit")
//    public String returnEditView(@PathVariable long id, Model viewModel) {
//        viewModel.addAttribute("post", postsDao.getById(id));
//        return "posts/edit";
//    }
//
//    @PostMapping("/posts/{id}/edit")
//    public String updatePost(@PathVariable long id, @RequestParam String title, @RequestParam String body) {
////        use the new form inputs to update the existing post in the DB
////        pull the existing post object from the database
//        Post post = postsDao.getById(id);
////        Set the title and body to the request param values
//        post.setTitle(title);
//        post.setBody(body);
////        persist the change in the db with the postsDao
//        postsDao.save(post);
//        return "redirect:/posts";
//    }
//
//    @PostMapping("/posts/{id}/delete")
//    public String deletePost(@PathVariable long id) {
//        postsDao.deleteById(id);
//        return "redirect:/posts";
//    }
//}
