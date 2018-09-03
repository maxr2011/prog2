package Uebung_17.Aufgabe_2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class TCPServer
{
  public static void main(String[] args) {
    try {

      final int PORT = 5000;
      ServerSocket ss = new ServerSocket(PORT);
      Socket connection = ss.accept();
      InputStream is = connection.getInputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(is));

      //c Galgenmännchen
      String serializedPerson = br.readLine();

      System.out.println(serializedPerson);

      is.close();
      connection.close();
      ss.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
