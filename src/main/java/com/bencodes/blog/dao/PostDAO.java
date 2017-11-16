package com.bencodes.blog.dao;

import com.bencodes.blog.entity.Post;

import java.text.ParseException;
import java.util.List;

public interface PostDAO {

    List<Post> getAllPosts();

    void addPost(Post thePost);

}
