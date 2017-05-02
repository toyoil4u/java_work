package java22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    public static Connection connectionMySql(){
        Connection conn = null;

        String url = "jdbc:mysql://localhost:5600/book_db?useUnicode=true&amp;characterEncoding=utf8";
        String user = "root";
        String passwd = "1234";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, passwd);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static Connection makeConnection(){
        return connectionMySql();
    }

    public static void main(String[] args) {
        Connection conn = DBConnect.connectionMySql();
        if (conn == null){
            System.out.println("Failed");
        } else {
            System.out.println("Success");
        }
    }
}
