/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.*;

/**
 *
 * @author Daniel
 */
public class CoursesUtil implements CoursesUtilInterface{

    public void changeMark(String studentID, String mark, String nrLab) {
        System.out.println(studentID + mark + nrLab);
        try {
            String query = "UPDATE courses SET " + nrLab + " = ? WHERE student_id = ?";
            PreparedStatement pstmt = new Utils().getConnection().prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(mark));
            pstmt.setString(2, studentID);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void changeAtendence(String studentID, int atendence, String nrLab) {
        try {
            String query = "UPDATE courses SET " + nrLab + " = ? WHERE student_id = ?";
            PreparedStatement pstmt = new Utils().getConnection().prepareStatement(query);
            pstmt.setInt(1, atendence);
            pstmt.setString(2, studentID);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getStudentInfo(String student, String subject) {
        ResultSet data = null;
        try {
            Connection con = new Utils().getConnection();
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM courses WHERE student_id = ? AND subject_id = ?;");
            stmt.setString(1, student);
            stmt.setString(2, subject);

            data = stmt.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void addNewStudentToCourse(String student, String subject) {
        try {
            Connection con = new Utils().getConnection();
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("INSERT INTO courses (student_id, subject_id) VALUES (?, ?);");
            stmt.setString(1, student);
            stmt.setString(2, subject);

            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
