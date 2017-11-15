package com.bencodes.blog.services;

import com.bencodes.blog.dao.PostDAO;
import com.bencodes.blog.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.transaction.Transactional;
import java.util.List;


@Service
@EnableTransactionManagement
public class PostServiceImpl implements PostService {

    @Autowired
    private PostDAO postDAO;


    @Override
    @Transactional
    public List<Post> getAllPosts() {
        return postDAO.getAllPosts();
    }

    @Override
    @Transactional
    public void savePost(Post thePost) {

        postDAO.savePost(thePost);
    }
}
