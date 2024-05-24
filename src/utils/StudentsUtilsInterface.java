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
public interface StudentsUtilsInterface {
       public ResultSet getStudentsByGroup(String group);
       public ResultSet getStudents();
       public ResultSet getStudent(String id);
}
