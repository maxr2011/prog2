package Uebung_15.Punkt;

/**
 * Created by maxr2011 on 09.02.2018.
 */
public class Main {

  public static void main(String[] args) throws PunktNichtAufDemBildschirmException {

    Punkt p = new Punkt();

    p.x = 24;
    p.y = 7;

    p.verschiebePunkt(-1 , 19);

  }

}
