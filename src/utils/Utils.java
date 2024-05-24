/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.*;

import java.sql.Connection;


/**
 *
 * @author Daniel
 */
public class Utils implements UtilsInterface{

    private Connection dbConnection;
    public Statement stmt;


    public Utils() {
        try {
            dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/else", "root", "0000");
            stmt = dbConnection.createStatement();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public Connection getConnection() {
        return dbConnection;
    }

    public Statement getStatement() {
        return stmt;
    }

}
