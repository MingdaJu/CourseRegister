/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.coe.dao;

import java.sql.*;
import java.util.*;
import neu.coe.pojo.Pojo;
import org.apache.commons.dbutils.*;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author jumin
 */
public class moviedao {

    public int addMovie(String title, String actor, String actress, String genre, String year) {
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


    public List<Pojo> searchMovies(String keyword, String value) {
        Connection connection = null;
        List<Pojo> movies = null;
        String sqlQuery = new String();
        sqlQuery = "SELECT * FROM movie WHERE " + keyword + " = ?";
        try {
            dao dbdao = new dao();
            connection = dbdao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            ResultSetHandler<List<Pojo>> h = new BeanListHandler<Pojo>(Pojo.class);
            movies = queryRunner.query(connection, sqlQuery, h, value);

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
        return movies;
    }
}
