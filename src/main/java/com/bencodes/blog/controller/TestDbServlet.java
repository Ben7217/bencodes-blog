package com.bencodes.blog.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet("/TestDbServlet")
public class TestDbServlet extends javax.servlet.http.HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //setup connection variables
        String user = "bencodes";
        String pass = "bencodes";

        String jdbcUrl = "jdbc:mysql://localhost:3306/bencodes.io?useSSL=false";

        String driver = "com.mysql.jdbc.Driver";

        //get connection to database

        try {
            PrintWriter out = response.getWriter();

            out.println("Connection to database: " + jdbcUrl);

            Class.forName(driver);

            Connection myConnection = DriverManager.getConnection(jdbcUrl, user, pass);

            out.println("Connection successful!");

            myConnection.close();


        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new ServletException(e);
        }


    }
}
