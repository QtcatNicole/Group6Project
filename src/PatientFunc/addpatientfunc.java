/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientFunc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 竹子
 */
public class addpatientfunc {
    private static final String URL = "jdbc:derby://localhost/HealthcareSystem";
    private static final String USERNAME = "group6";
    private static final String PASSWORD = "group6";
    private Connection connection = null; // manages connection
    private PreparedStatement insertNewPerson = null;
    
    // constructor
    public addpatientfunc() {
        try {
            connection =
                    DriverManager.getConnection(URL, USERNAME, PASSWORD);

            insertNewPerson = connection.prepareStatement(
                    "INSERT INTO PATIENT "
                    + "(PNAME,PID,PUSERNAME,PPSWD,PGENDER) "
                    + "VALUES (?,?,?,?,?)");
        }
        catch(SQLException sqlException) {
            System.out.println(sqlException.toString());
            System.exit(1);
        }
    }
    
    public int addPerson(String name, int id, String username, String pswd, String gender) {
        int result = 0;
        String ID = ""+id;
        
        try {
            insertNewPerson.setString(1, name);
            insertNewPerson.setString(2, ID);
            insertNewPerson.setString(3, username);
            insertNewPerson.setString(4, pswd);
            insertNewPerson.setString(5, gender);
            
            result = insertNewPerson.executeUpdate();
        }
        catch(SQLException sqlException) {
            System.out.println(sqlException.toString());
            close();
        }

        return result;
    }
    
    public void close() {
        try {
            connection.close();
        }
        catch(SQLException sqlException) {
            System.out.println(sqlException.toString());
        }
    }   
}
