package com.bencodes.blog.controller;

import com.bencodes.blog.entity.Post;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;


public class test {

    public static void main(String[] args) {


            String jdbcUrl = "jdbc:mysql://localhost:3306/bencodes.io?useSSL=false";
            String user = "bencodes";
            String pass = "bencodes";

            try {
                System.out.println("Connecting to database: " + jdbcUrl);

                Connection myConn =
                        DriverManager.getConnection(jdbcUrl, user, pass);

                System.out.println("Connection successful!!!");

            }
            catch (Exception exc) {
                exc.printStackTrace();
            }

        }
    }

