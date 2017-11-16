package com.bencodes.blog.services;

import com.bencodes.blog.entity.Post;

import java.text.ParseException;
import java.util.List;

public interface PostService {

    List<Post> getAllPosts();

    void addPost(Post thePost);
}
