/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

import java.sql.ResultSet;
import java.util.Map;

/**
 *
 * @author Daniel
 */
public interface SubjectsUtilsInterface {
        public ResultSet getSubjects();
        public void deleteSubject(String name);
        public void addNewSubject(String name);
        public Map<String, String> getIdByName();
        public Map<String, String> getNameById();
}
