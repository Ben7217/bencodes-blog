package com.bencodes.blog.dao;

import com.bencodes.blog.entity.Post;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class PostDAOImpl implements PostDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Post> getAllPosts() {
        // I need to get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query

        Query<Post> theQuery = currentSession.createQuery("from Post order by date", Post.class);

        // execute query and get result list
        List<Post> posts = theQuery.getResultList();

        // return posts
        return posts;
    }

/*    @Override
    public Post postPost(String) {

        Session currentSession = sessionFactory.getCurrentSession();


        Query<Post> theQuery = currentSession.createQuery("insert into Post (title,author,date,post)");

        return null;
    }*/
}
