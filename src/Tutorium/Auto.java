package Tutorium;

import java.io.Serializable;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class Auto implements Serializable, Comparable{

  int PS;
  String Marke;
  String Modell;
  int Baujahr;

  transient String Kennzeichen;

  public Auto(int p, String ma, String mo, int b){
    this.PS = p;
    this.Marke = ma;
    this.Modell = mo;
    this.Baujahr = b;
  }

  public Auto withKennzeichen(String k){
    this.Kennzeichen = k;
    return this;
  }

  public int compareTo(Object o){

    // Autos anhand ihrer PS Leistung vergleichen
    Auto a = (Auto) o;
    return (this.PS < a.PS ? -1 : (this.PS == a.PS ? 0 : 1));

  }

}
