package Uebung_16.Aufgabe_1;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class MatrikelNummerException extends Exception {

  public MatrikelNummerException(){

    super("Falsche Matrikelnummer!");

  }

  public MatrikelNummerException(int a){

    super(a+ " ist eine ungültige Matrikelnummer!");

  }

  public MatrikelNummerException(String text){

    super(text);

  }

}
