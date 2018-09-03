package Tutorium_2;

import java.security.InvalidParameterException;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class Raum {

  int anzahlDerStudenten;

  public void setAnzahlDerStudenten(int a){

    if(a < 0){
      throw new InvalidParameterException("Zahl darf nicht negativ sein.");
    } else {
      anzahlDerStudenten = a;
    }

  }

}
