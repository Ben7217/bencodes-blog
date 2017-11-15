
package com.bencodes.blog.controller;

import com.bencodes.blog.entity.Post;
import com.bencodes.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Controller for allPosts.jsp
 */
@Controller
@RequestMapping("/blog")
public class IndexController {

    @Autowired
    private PostService postService;

    @RequestMapping("/list")
    public String showPage (Model theModel) {

        // get posts from DAO

        List<Post> thePosts = postService.getAllPosts();

        // add the posts to the model

        theModel.addAttribute("allPosts", thePosts);
        return "allPosts";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        //create model attribute to bind form data
        Post thePost = new Post();

        theModel.addAttribute("post", thePost);

        return "postSuccess";
    }

    @PostMapping("/savePost")
    public String saveCustomer(@ModelAttribute("post") Post thePost) {
        // save the customer using our service

        postService.savePost(thePost);
        return "allPosts";
    }





}