package Altklausur.Aufgabe_1;

import static java.awt.SystemColor.TEXT;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.BufferedReader;

/**
 * Created by maxr2011 on 12.02.2018.
 */
public class ibanAusDateiLesen extends IBANCheck {

  void ibanAusDateiLesen(String datname) throws FalscheIBANException {

    try{

      BufferedReader bf = new BufferedReader(new FileReader(datname));

      boolean alleGültig = false;
      String TEXT;
      while((TEXT = bf.readLine()) != null){

        alleGültig = ibanCheck(TEXT);

      }

      if(alleGültig) System.out.println("Erfolg");

    } catch(NullPointerException n){
      System.out.println("Datei "+datname+" existiert nicht");
    } catch(FileNotFoundException f){
      System.out.println("Datei "+datname+" nicht gefunden");
    } catch(IOException e){
      //e.printStackStrace();
      System.out.println("Fehler bei Lesevorgang von Datei: "+datname+"");
    }

  }

  void dateienLesen(String[] dateien)
      throws FalscheIBANException {

    for(int i = 0; i < dateien.length; i++){
      ibanAusDateiLesen(dateien[i]);
    }

  }

}
