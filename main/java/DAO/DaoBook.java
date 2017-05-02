package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

import java22.DBConnect;

public class DaoBook {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        for (;true;){
            System.out.println("원하는 검색은(1:전체, 2:유사한 책이름, 3:일치하는 책이름, 0:끝내기) : ");
            int sel = scan.nextInt();
            scan.nextLine();
            if (sel == 1){
                getSQLselectALL();
            } else if (sel == 2){
                System.out.println("책이름의 일부 : ");
                getSQLselectLIKE(scan.nextLine());
            } else if (sel == 3){
                System.out.println("책이름의 전체 : ");
                getSQLselectEQUAL(scan.nextLine());
            } else {
                break;
            }
        }
    }

    public static ResultSet getSQLselectALL(){
        Connection conn = DBConnect.makeConnection();

        String query = "Select * from book order by bookid asc";

        ResultSet rs = null;
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();

            for ( ; rs.next(); ) {
                int bookid       = rs.getInt    ("bookid"   );
                String bookname  = rs.getString ("bookname" );
                String publisher = rs.getString ("publisher");
                String year      = rs.getString ("year"     );
                int price        = rs.getInt    ("price"    );
                Date dtm         = rs.getDate   ("dtm"      );
                boolean use_yn   = rs.getBoolean("use_yn"   );

                String out = String.format(" %d \t %15s \t %10s \t %4s \t %7d \t %10s \t %b",
                        bookid, bookname, publisher, year, price, dtm, use_yn);
                System.out.println(out);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rs;
    }

    public static ResultSet getSQLselectLIKE(String bkname){
        Connection conn = DBConnect.makeConnection();

        String query = "Select * from book where bookname like ?";
        ResultSet rs = null;

        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + bkname + "%");
            rs = stmt.executeQuery();

            for ( ; rs.next(); ) {
                int bookid       = rs.getInt    ("bookid"   );
                String bookname  = rs.getString ("bookname" );
                Date dtm         = rs.getDate   ("dtm"      );
                boolean use_yn   = rs.getBoolean("use_yn"   );

                String out = String.format(" %d \t %15s \t %10s \t %b",
                        bookid, bookname, dtm, use_yn);
                System.out.println(out);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rs;
    }

    public static ResultSet getSQLselectEQUAL(String bkname){
        Connection conn = DBConnect.makeConnection();

        String query = "Select * from book where bookname = ?";
        ResultSet rs = null;

        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, bkname);
            rs = stmt.executeQuery();

            for ( ; rs.next(); ) {
                int bookid       = rs.getInt    ("bookid"   );
                String bookname  = rs.getString ("bookname" );
                Date dtm         = rs.getDate   ("dtm"      );
                boolean use_yn   = rs.getBoolean("use_yn"   );

                String out = String.format(" %d \t %15s \t %10s \t %b",
                        bookid, bookname, dtm, use_yn);
                System.out.println(out);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rs;
    }
}
