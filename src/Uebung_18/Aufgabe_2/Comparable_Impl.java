package Uebung_18.Aufgabe_2;

import Uebung_18.Aufgabe_1.Karte;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Comparable_Impl implements Comparable {

  public String cps = "";

  public String getCps(){return cps;}
  public void setCps(String s){this.cps = s;}

  public Comparable_Impl(String s){
    this.cps = s;
  }

  @Override
  public int compareTo(Object o){

    return this.cps.compareTo(o.toString());

  }

}
