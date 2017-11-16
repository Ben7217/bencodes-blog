
package com.bencodes.blog.controller;

import com.bencodes.blog.entity.Post;
import com.bencodes.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    public String savePost(@RequestParam("author") String author,
                           @RequestParam("title") String title, @RequestParam("date") String date,
                           @RequestParam("post") String post) throws ParseException {


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date theDate = sdf.parse(date);

        // save the customer using our service
        Post thePost = new Post();
        thePost.setAuthor(author);
        thePost.setDate(theDate);
        thePost.setTitle(title);
        thePost.setPost(post);

        postService.addPost(thePost);

        System.out.println(thePost.toString()); //testing
        return "success";
    }





}