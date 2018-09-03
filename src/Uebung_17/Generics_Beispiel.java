package Uebung_17;

import java.util.ArrayList;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Generics_Beispiel {

  public static void main(String[] args){

    // ohne Generics
    ArrayList AO = new ArrayList();

    // mit Generics
    ArrayList<Integer> AL = new ArrayList();

    int a = 1;
    int b = 2;
    int c = 3;

    AL.add(a);
    AL.add(b);
    AL.add(c);

    AO.add(a);
    AO.add(b);
    AO.add(c);

    // ohne Generics
    for(Object e : AO){
      System.out.println((int) e); // cast
    }

    // mit Generics
    for(int i : AL){
      System.out.println(i);
    }

  }

}
