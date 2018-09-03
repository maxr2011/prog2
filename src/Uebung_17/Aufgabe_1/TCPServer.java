package Uebung_17.Aufgabe_1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

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

      String Loesungswort = "Rohrzangenklempner";

      int wortLaenge = Loesungswort.length();
      String[] Loesung = Loesungswort.split("");

      Boolean[] bA = new Boolean[wortLaenge];
      for(int i = 0; i < bA.length; i++)
        bA[i] = false;
      int maxVersuche = 7;
      int Vers = 0;

      String Text = null;

      while((Text=br.readLine()) != null) {
        /*
        System.out.println(Charset.defaultCharset() + ": " + br.readLine());
        System.out.println(StandardCharsets.ISO_8859_1 + ": " + br.readLine());
        System.out.println(StandardCharsets.UTF_16 + ": " + br.readLine());
        System.out.println(StandardCharsets.UTF_8 + ": " + br.readLine());
        System.out.println(StandardCharsets.US_ASCII + ": " + br.readLine());
        */

        boolean b = false;

        for(int i = 0; i < Loesung.length; i++){
          if(Text.equals(Loesung[i].toLowerCase()) || Text.equals(Loesung[i].toUpperCase())){
            b = true;
            bA[i] = true;
          }
        }

        if(!b){
          int vdiff = (maxVersuche-Vers);

          if(vdiff == 0){
            System.out.println("Das war leider nicht richtig! Keinen Versuch mehr!");
          } else if(vdiff == 1){
            System.out.println("Das war leider nicht richtig! Du hast noch einen Versuch!");
          } else {
            System.out.println("Das war leider nicht richtig! Du hast noch "+vdiff+" Versuche!");
          }

          Vers++;
        }

        boolean win = true;

        for(int i = 0; i < bA.length; i++){

          if(bA[i]) {
            System.out.print(Loesung[i]+" ");
          } else {
            System.out.print("_ ");
            win = false;
          }

        }

        if(Vers == maxVersuche+1) {
          System.out.println("Du hast leider verloren!");
          break;
        }
        if(win) {
          System.out.println("Du hast gewonnen! Herzlichen Glückwunsch!");
          break;
        }

        //a OK
        System.out.println("OK");

      }
      is.close();
      connection.close();
      ss.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
