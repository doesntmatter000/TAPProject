/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public interface UtilsInterface {
    public Connection getConnection();
    public Statement getStatement();
}
