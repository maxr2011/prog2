package Uebung_16.Aufgabe_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class b {

  public static boolean isMat(int m){

    if(m < 9999999 || m > 1000000){

      int a = m/100000;
      return (a == 50 || a == 51 || a == 61);

    }

    return false;

  }

  public static boolean isWinf(int m){return (m >= 5000000 && m <= 5099999);}
  public static boolean isInf(int m){return (m >= 5100000 && m <= 5199999);}
  public static boolean isEC(int m){return (m >= 6100000 && m <= 6199999);}

  public static void outputArrayList(ArrayList AL){

    for(Object i : AL){
      System.out.println(i);
    }

  }

  public static void writeAL2File(ArrayList AL, String filename) throws IOException {

    FileWriter fw = new FileWriter(filename);
    BufferedWriter bw = new BufferedWriter(fw);

    for(Object i : AL){

      bw.write(i.toString());
      bw.newLine();

    }

    bw.close();

  }

  public static void splitStudiengaenge(String dateiname) throws FileNotFoundException, IOException, MatrikelNummerException{

    FileReader fr = new FileReader(dateiname);
    BufferedReader br = new BufferedReader(fr);

    ArrayList Inf = new ArrayList<Integer>();
    ArrayList Winf = new ArrayList<Integer>();
    ArrayList EC = new ArrayList<Integer>();

    String zeile = null;
    while ((zeile = br.readLine()) != null) {

      int MatZahl = Integer.parseInt(zeile);

      if(isMat(MatZahl)){

        if(isInf(MatZahl)){
          Inf.add(MatZahl);
        } else if(isWinf(MatZahl)){
          Winf.add(MatZahl);
        } else if(isEC(MatZahl)){
          EC.add(MatZahl);
        }

      } else {
        throw new MatrikelNummerException(MatZahl);
      }
    }

    br.close();

    Collections.sort(Inf);
    Collections.sort(Winf);
    Collections.sort(EC);

    outputArrayList(Inf);
    System.out.println("----");
    outputArrayList(Winf);
    System.out.println("----");
    outputArrayList(EC);

    writeAL2File(Inf, "InfNr.txt");
    writeAL2File(Winf, "WInfNr.txt");
    writeAL2File(EC, "ECNr.txt");

  }

}
