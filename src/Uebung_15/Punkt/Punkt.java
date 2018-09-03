package Uebung_15.Punkt;

/**
 * Created by maxr2011 on 09.02.2018.
 */
public class Punkt {

  int x;
  int y;

  public void verschiebePunkt(int zielX, int zielY) throws PunktNichtAufDemBildschirmException {

    boolean negative = (zielX < 0) || (zielY < 0);
    boolean toobig = (zielX > 1920) || (zielY > 1080);

    if(negative || toobig) throw new PunktNichtAufDemBildschirmException();

    x = zielX;
    y = zielY;

  }

}
