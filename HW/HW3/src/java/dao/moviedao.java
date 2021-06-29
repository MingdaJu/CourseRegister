/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.*;
import java.util.*;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import pojo.moviepojo;


/**
 *
 * @author jumin
 */
public class moviedao {
    public int addUser(String title, String actor, String actress, String genre, String year) {
     int result = 0;
     Connection connection = null;
      try {
            dao dbdao = new dao();
            connection = dbdao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            String query = "INSERT INTO movie (title, actor, actress, genre, year) VALUES (?,?,?,?,?)";
            result = queryRunner.update(connection, query, title, actor, actress, genre, year);
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        } finally {
            try {
                DbUtils.close(connection);
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return result;

    }
     
     public List<moviepojo> searchUser(String searchVal, String parameter) {
        List<moviepojo> users = null;
        String sqlQuery = new String();
        
         Connection connection = null;

        //sqlQuery = "SELECT * FROM movie where title = ?";
        sqlQuery = "SELECT * FROM movie WHERE " + parameter + " = ?";
     //sqlQuery = "SELECT * FROM movie where"+searchVal+"='"+ parameter+"'";
        
        try {
            dao dbdao = new dao();
            connection = dbdao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            ResultSetHandler<List<moviepojo>> h = new BeanListHandler<moviepojo>(moviepojo.class);
            users = queryRunner.query(connection, sqlQuery,h,searchVal);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        } finally {
            try {
                DbUtils.close(connection);
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

        return users;

    }
}
