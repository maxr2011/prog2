package Tutorium_10;

/**
 * Created by maxr2011 on 13.02.2018.
 */
public class MountenBike extends Fahrrad {

  int anzahlGaenge;
  int aktuellerGang = 1;

  public void fahren(){
    System.out.println("Ich fahre im "+aktuellerGang+" Gang");
  }

  public void schalten(int gang) throws IllegalArgumentException {
    if(gang < 1) throw new IllegalArgumentException();
    this.aktuellerGang = gang;
  }

}
