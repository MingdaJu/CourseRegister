/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author jumin
 */
public class dao {
    //static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/movie?useSSL=false&serverTimezone=UTC";   
    static final String USER = "root";
    static final String PASSWORD = "jumd1234";
    public Connection connection;

    public Connection getConnection() throws Exception {
        try {
            
            DbUtils.loadDriver(JDBC_DRIVER);
            this.connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (SQLException ex) {

            System.out.println(ex);
            ex.printStackTrace();
            throw new Exception();
        }
        

        return this.connection;
    }
}
