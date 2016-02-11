/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nia
 */
public class ConnectionManager {
    private static Connection connection;
    static {
        try {
            
 
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "Ywd6h7ap");
         } catch (ClassNotFoundException e) {
             System.out.println("can load driver");
   
        }catch(SQLException exception){
            System.out.println("Cannot connect to database");
        }
    }
    
    public static Connection getConnection(){
        return connection;
    }
    
}
