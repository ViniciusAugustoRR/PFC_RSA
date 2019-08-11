package connection;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFac {
    
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/rsa";
    private static final String user = "root";
    private static final String pass = "";
    
    
    public static Connection getConnection(){
        
        try {
            
            Class.forName(driver);
            
            return DriverManager.getConnection(url, user, pass);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão bro",ex);
        }
    }
    
    public static void closeConnection(Connection con){
        
        if(con != null){
            
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Error : " + ex);
            }
            
        }
        
    }
    
    public static void closeConnection(Connection con,  PreparedStatement stmt){
        
        if(stmt != null){
            
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Error : " + ex);
            }
            
        }
        
        closeConnection(con);

        
    }
    
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        if(rs != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Error : " + ex);
            }
        }
        
        closeConnection(con, stmt);
        
    }
    
}
