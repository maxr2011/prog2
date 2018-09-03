package Uebung_17.Aufgabe_2;

import java.io.OutputStream;
import java.net.Socket;
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

      //ObjectOutputStream

      os.close();
      connectionToServer.close();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}