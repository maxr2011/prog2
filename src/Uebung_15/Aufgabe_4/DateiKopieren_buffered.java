package Uebung_15.Aufgabe_4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by maxr2011 on 09.02.2018.
 */
public class DateiKopieren_buffered {

  void copy(String InputFileName, String OutputFileName) throws FileNotFoundException {

    try {

      try {

        BufferedInputStream fin = new BufferedInputStream(new FileInputStream(InputFileName));
        BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream(OutputFileName));
        int i;
        do {
          i = fin.read();
          if (i != -1)
            fout.write(i);
        } while (i != -1);
        fin.close();
        fout.close();

      } catch (FileNotFoundException fnf){
        System.out.println("Datei wurde nicht gefunden! (buffered)");
      }

    } catch (IOException e){
      System.out.println("IOException!");
    }

  }

}
