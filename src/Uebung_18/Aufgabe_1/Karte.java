package Uebung_18.Aufgabe_1;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Karte {

  int ID; // optional
  String Bedeutung;
  String Farbe;

  public Karte(String a, String b){
    this.Bedeutung = a;
    this.Farbe = b;
  }

  public Karte(String a, String b, int id){
    this.Bedeutung = a;
    this.Farbe = b;
    this.ID = id;
  }

}
