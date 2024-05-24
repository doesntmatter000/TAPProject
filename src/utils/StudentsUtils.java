/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class StudentsUtils implements StudentsUtilsInterface{

    public ResultSet getStudentsByGroup(String group) {
        ResultSet results = null;
        try {
            PreparedStatement statement = new Utils().getConnection().prepareStatement("SELECT * FROM students WHERE student_group = ?;");
            statement.setString(1, group);
            results = statement.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return results;
    }
    
    public ResultSet getStudents() {
        ResultSet res = null;
        try {
            res = new Utils().getStatement().executeQuery("SELECT * FROM else.students");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;
    }
    
    
    public ResultSet getStudent(String id) {
        ResultSet res = null;
        try {
            Connection con = new Utils().getConnection();
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM students WHERE student_id = ?");
            stmt.setString(1, id);
            res = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;
    }
    
    public boolean deleteStudent(String id) {
        boolean deleted = false;
        try {
            Connection con = new Utils().getConnection();
            PreparedStatement stmt = con.prepareStatement("DELETE FROM students WHERE student_id = ?");
            stmt.setString(1, id);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                deleted = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return deleted;
    }
}
