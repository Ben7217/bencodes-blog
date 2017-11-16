package com.bencodes.blog.entity;


import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Store;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;


@Entity
@Indexed
@EnableTransactionManagement
@Table(name = "blog")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "author", nullable = false, length = 100)
    @org.hibernate.search.annotations.Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
    private String author;


    @Column(name = "title", nullable = false, length = 100)
    @org.hibernate.search.annotations.Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
    private String title;

    @Column(name = "date", nullable = false, length = 25)
    @org.hibernate.search.annotations.Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
    private Date date;

    @Column(name = "post", nullable = false, length = 60000)
    @org.hibernate.search.annotations.Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
    private String post;




    public Post () {}

    public Post(String author, String title, Date date, String post) {
        this.author = author;
        this.title = title;
        this.date = date;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }


    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}
