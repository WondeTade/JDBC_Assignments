
package JDBC_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment2 {

    public static Connection getConnection() throws Exception{
      
        try{
            String url = "jdbc:mysql://localhost:3306/newsqlandjava";
            String username = "super";
            String password = "admin";
            
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database");
            return conn;
        }catch(Exception e){ System.out.println(e);}
        return null;
    }
    public static void main(String[]args)throws Exception {
        //Get Connection
        Connection conn = getConnection();
        
        //Create statement
        Statement statement = conn.createStatement();
        
        //Execute SQL Query
        
        ResultSet res = statement.executeQuery("select * from cars");
        
        //Process ResultSet
        while(res.next()){
            System.out.println(res.getString("car_id") + ": " + 
                                res.getString("brand") + " " +
                                res.getString("color"));
        }
    }
}
