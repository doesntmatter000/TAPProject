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
public interface AllGroupsUtilsInterface {
    public ResultSet getAllGroupsColumnGroup_name();
    public ResultSet getAllGroups();
    public ResultSet getGroupColumnGroup_nameData();
    public Map<String,String> getIdByName();
    public Map<String,String> getNameById();
}
