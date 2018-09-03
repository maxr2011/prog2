package Altklausur.Aufgabe_1;

/**
 * Created by maxr2011 on 12.02.2018.
 */
public class FalscheIBANException extends Exception{

  public FalscheIBANException(){
    super("FEHLER: Datei enthält ungültige IBAN");
  }

  public FalscheIBANException(String message){
    super(message);
  }

}
