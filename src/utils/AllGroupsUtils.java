/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Daniel
 */
public class AllGroupsUtils implements AllGroupsUtilsInterface{

    public Map<String, String> groupName;
    public Map<String, String> groupId;

    public AllGroupsUtils() {
        try {
            ResultSet GroupsData = getAllGroups();
            groupName = new HashMap();
            groupId = new HashMap();
            while (GroupsData.next()) {
                groupName.put(GroupsData.getString("group_name"), GroupsData.getString("group_id"));
                groupId.put(GroupsData.getString("group_id"), GroupsData.getString("group_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet getAllGroupsColumnGroup_name() {
        ResultSet results = null;
        try {
            results = new Utils().getStatement().executeQuery("SELECT group_name FROM allgroups;");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return results;
    }

    public ResultSet getAllGroups() {
        ResultSet results = null;
        try {
            results = new Utils().getStatement().executeQuery("SELECT * FROM allgroups;");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return results;
    }
    
    
    public ResultSet getGroupColumnGroup_nameData() {
        ResultSet results = null;
        try {
            results = new Utils().getStatement().executeQuery("SELECT group_name FROM allgroups;");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return results;
    }
    
    
    public Map<String,String> getIdByName() {
        return groupName;
    }
    
    public Map<String,String> getNameById() {
        return groupId;
    }

}
