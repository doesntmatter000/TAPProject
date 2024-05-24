/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Daniel
 */
public class SubjectsUtils implements SubjectsUtilsInterface{

    public Map<String, String> subjectName;
    public Map<String, String> subjectId;

    public SubjectsUtils() {
        try {
            ResultSet GroupsData = getSubjects();
            subjectName = new HashMap();
            subjectId = new HashMap();
            while (GroupsData.next()) {
                subjectName.put(GroupsData.getString("subject_name"), GroupsData.getString("subject_id"));
                subjectId.put(GroupsData.getString("subject_id"), GroupsData.getString("subject_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet getSubjects() {
        ResultSet res = null;
        try {
            res = new Utils().getStatement().executeQuery("SELECT * FROM else.subjects");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public void deleteSubject(String name) {
        try {
            String query = "DELETE FROM subjects WHERE subject_name = ?";
            PreparedStatement pstmt = new Utils().getConnection().prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addNewSubject(String name) {
        try {
            String query = "INSERT INTO `else`.`subjects` (`subject_name`) VALUES (?);";
            PreparedStatement pstmt = new Utils().getConnection().prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        } catch (Exception e) {
        }
    }

    
    
    
    
    public Map<String, String> getIdByName() {
        return subjectName;
    }

    public Map<String, String> getNameById() {
        return subjectId;
    }
}
