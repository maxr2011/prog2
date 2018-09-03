package Uebung_18.Aufgabe_1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Kartenhand<Karte> {

  Set<Karte> KK;

  public Kartenhand(){

    this.KK = new HashSet<>();

  }

  void add(Karte k){

    KK.add(k);

  }

  boolean remove(Karte k){

    return KK.remove(k);

  }

}
