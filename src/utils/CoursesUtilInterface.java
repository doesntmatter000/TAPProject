/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

import java.sql.ResultSet;

/**
 *
 * @author Daniel
 */
public interface CoursesUtilInterface {
    public void changeMark(String studentID, String mark, String nrLab);
    public void changeAtendence(String studentID, int atendence, String nrLab);
    public ResultSet getStudentInfo(String student, String subject);
    public void addNewStudentToCourse(String student, String subject);
}
