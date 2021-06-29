/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.coe.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author jumin
 */
public class bookDao {
     public static int addBook(String id[],String isbn[],String title[],String author[],String price[]) throws SQLException,ClassNotFoundException{
        int result = 0;
        Connection connection = null;
        PreparedStatement preparestatement=null;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root", "jumd1234");

            String books = "INSERT INTO new_table (id, isbn, title, author, price)VALUES(?,?,?,?,?)";
            preparestatement = connection.prepareStatement(books);
            for(int i=0;i<id.length;i++){  
              preparestatement.setString(1, id[i]);  
              preparestatement.setString(2, isbn[i]);
              preparestatement.setString(3, title[i]);
              preparestatement.setString(4, author[i]);
              preparestatement.setString(5, price[i]);
              preparestatement.executeUpdate();
            }
        }catch (Exception e) {
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
}
