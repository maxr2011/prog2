package Uebung_18.Aufgabe_3;

import java.util.Iterator;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Main {

  public static void main(String[] args){

    String[] a = new String[10];

    // Bisherige Iteration durch ein Array
    for(int i = 0; i < a.length; i++){
      a[i] = "" + i + "";
      System.out.println(a[i]);
    }

    System.out.println();

    // Mit ArrayIterator
    Iterator i = new ArrayIterator(a);

    while(i.hasNext()){
      System.out.println(i.next());
    }


  }

}
