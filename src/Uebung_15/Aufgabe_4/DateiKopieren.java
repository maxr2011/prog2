package Uebung_15.Aufgabe_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by maxr2011 on 09.02.2018.
 */

// Als Beispiel
public class DateiKopieren
{

  public void copy(String inputFileName, String outputFileName) throws FileNotFoundException{

    try
    {

      // Unbuffered
      try {
        InputStream fis = new FileInputStream(inputFileName);
        OutputStream fos = new FileOutputStream(outputFileName);
        int b;
        do {
          b = fis.read();
          if (b != -1)
            fos.write(b);
        }
        while (b != -1);
        fis.close();
        fos.close();
      } catch (FileNotFoundException fnf){
        System.out.println("Datei nicht gefunden!");
      }


    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

  }

  public static void main(String[] args) throws FileNotFoundException {

    DateiKopieren k = new DateiKopieren();
    k.copy("pic1.jpg", "copy.jpg");

  }
}
