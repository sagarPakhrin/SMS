package com.example.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        Connection con;
        Statement st;
        ResultSet rs;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","Su1was4na3");
            st = con.createStatement();
            rs= st.executeQuery("select * from student");

            while (rs.next())
            {
                System.out.println("\nID : " + rs.getInt(1));
                System.out.println("Name : " + rs.getString(2));
            }
        }
        catch (Exception e)
        {
            System.out.println("Error " + e.getMessage());
        }
    }
}
