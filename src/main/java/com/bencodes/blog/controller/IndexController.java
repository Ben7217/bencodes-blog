
package com.bencodes.blog.controller;

import com.bencodes.blog.entity.Post;
import com.bencodes.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Controller for allPosts.jsp
 */
@Controller
public class IndexController {

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String showPage (Model theModel) {

        // get posts from DAO

        List<Post> thePosts = postService.getAllPosts();

        // add the posts to the model

        theModel.addAttribute("allPosts", thePosts);
        return "allPosts";
    }
}