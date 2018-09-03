package Uebung_17.Aufgabe_1;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class TCPClient
{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);



    try{
      final int PORT = 5000;
      final String HOST = "localhost";
      Socket connectionToServer = new Socket(HOST, PORT);
      OutputStream os = connectionToServer.getOutputStream();
      /*
      os.write("Suppe mit dem Löffel löffeln\n".getBytes()); //Charset.defaultCharset()
      os.write("Suppe mit dem Löffel löffeln\n".getBytes(StandardCharsets.ISO_8859_1));
      os.write("Suppe mit dem Löffel löffeln\n".getBytes(StandardCharsets.UTF_16));
      os.write("Suppe mit dem Löffel löffeln\n".getBytes(StandardCharsets.UTF_8));
      os.write("Suppe mit dem Löffel löffeln\n".getBytes(StandardCharsets.US_ASCII));
      */

      //b
      String TextIN;
      System.out.print("Eingabe: ");
      while(!(TextIN=sc.nextLine()).equals("exit")){
        System.out.print("Eingabe: ");
        os.write(TextIN.getBytes());
        os.write("\n".getBytes());
      }

      os.close();
      connectionToServer.close();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}