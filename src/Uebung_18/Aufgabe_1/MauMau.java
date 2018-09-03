package Uebung_18.Aufgabe_1;

import Uebung_18.Aufgabe_2.Comparable_Impl;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class MauMau {

  static Stapel<Karte> ST = new Stapel<>();
  static Spieler[] SP = new Spieler[2];

  public static void main(String[] args){

    // Spieler erstellen;
    for(int i = 0; i < SP.length; i++){
      SP[i] = new Spieler();
    }

    // Der Stapel ist GenericStack also als Stack implementiert
    ST.push((Karte) new Karte("König", "Karo"));

    // Die Spielerhand als Set implementiert, da Karten nicht doppelt vorkommen dürfen
    Karte k1 = new Karte("Ass", "Herz");
    SP[0].KH.add(k1);
    Karte k2 = new Karte("Neun", "P");
    SP[1].KH.add(k2);

    // Vergleichen mit Comparable testen
    String a = ""; String b = "";

    for(Karte c : SP[0].KH.KK){
      a = c.toString();
    }

    Comparable<Karte> CP = new Comparable_Impl((String) a);

    for(Karte d : SP[1].KH.KK){
      System.out.println(CP.compareTo(d));
    }

  }

}
