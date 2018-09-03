package DB2;

/**
 * Created by maxr2011 on 28.01.2018.
 */

import java.io.*;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class mysql {

  public static void main(String[] args) throws  IOException{

    try {

      Class.forName("com.mysql.jdbc.Driver");

    } catch(Exception u){

      System.out.println("nicht geklappt! jdbc driver nicht gefunden!");

    }


    Connection conn = null;
    try {

      FileReader fr = new FileReader("param.txt");
      BufferedReader br = new BufferedReader(fr);

      String host = "87.230.22.120";
      String user = "android_app";
      String pass = "DB!_hp_mA_dmin892";
      String db = "android_app_test";


      String url = "jdbc:mysql://" + host + "/" + db + "?user=" + user + "&password=" + pass + "";
      System.out.println(url);

      conn = DriverManager.getConnection(url);

    System.out.println("Verbindung erfolgreich hergestellt!");

      DatabaseMetaData md = (DatabaseMetaData) conn.getMetaData();
      /*
      ResultSet rs = md.getTables("adventureworks",null,null,null);
      while(rs.next())
      {
        System.out.println(rs.getString("TABLE_NAME"));
      }
      */
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT `username` FROM `"+db+"`.`login` LIMIT 0, 10");

      Statement stp = conn.createStatement();
      /*
      stp.executeUpdate(
            "INSERT INTO `" + db + "`.`login` (`uID`, `email`, `username`, `password`, `time_last_login`) VALUES (7, '', 'Thomas', '', '2018-06-01 12:29:25')");

      */
      while ( rs.next() ) {
        String lastName = rs.getString("username");
        System.out.println(lastName);
      }

      conn.close();

    // Do something with the Connection


  } catch (SQLException ex) {
    // handle any errors
    System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
  }

  }

}
