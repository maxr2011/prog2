package Uebung_16.Aufgabe_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class a {

  public static void main(String[] args) throws FileNotFoundException, IOException {


    FileReader fr = new FileReader("param.txt");
    BufferedReader br = new BufferedReader(fr);

    String host = br.readLine();
    String user = br.readLine();
    String pass = br.readLine();
    String db = br.readLine();


    String url = "jdbc:mysql://" + host + "/" + db + "?user=" + user + "&password=" + pass + "";
    System.out.println(url);



  }

}
