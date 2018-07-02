package com.luminent.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResourceService {
    /**
     * Objective: Getting data from SQL
     * Getting Resource Object populated
     */

    DBConnection dbCon = new DBConnection();
    Connection conn = dbCon.connect();


    //get resource from db
    public Resource getResource(int id) {
        Statement stmt = null;
        try {
            stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM USERS WHERE id={id}");



        rs.close();
        stmt.close();
        conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }


}
