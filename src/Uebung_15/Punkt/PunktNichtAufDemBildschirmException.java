package Uebung_15.Punkt;

/**
 * Created by maxr2011 on 09.02.2018.
 */
public class PunktNichtAufDemBildschirmException extends Exception {

  public PunktNichtAufDemBildschirmException(){

    super("Der Punkt ist nicht mehr auf dem Bildschirm!");

  }

  public PunktNichtAufDemBildschirmException(String fehlermeldung){

    super(fehlermeldung);

  }

}
