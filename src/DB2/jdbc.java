package DB2;

import java.sql.*;

/**
 * Created by maxr2011 on 12.01.2018.
 */
public class jdbc {

  public static void copyStudents() {

    try {
      Class.forName("COM.ibm.db2.jdbc.net.DB2Driver");

    } catch (ClassNotFoundException e) {
      System.out.println("Hier ist ein ClassNotFoundException aufgetreten!");
    }

      try {

        String url = "jdbc:db2://host:6789/myDB";
        url = "";
        Connection con = DriverManager.getConnection(url, "login", "password");

        Statement stmt = con.createStatement();
        PreparedStatement pStmt = con
            .prepareStatement("INSERT INTO statistik (matrikel) VALUES (?)");

        ResultSet rs = stmt.executeQuery("SELECT matrikel FROM student");

        while (rs.next()) {

          String matrikel = rs.getString(1);
          pStmt.setString(1, matrikel);
          pStmt.executeUpdate();

          System.out.println(matrikel);

        }

        con.close();


      } catch (SQLException f){

          System.out.println("Hier ist ein SQL Exception aufgetreten!");
      }


  }


  public static void main(String[] args){


        System.out.println("Ergebnis: ");
        copyStudents();


  }

}
