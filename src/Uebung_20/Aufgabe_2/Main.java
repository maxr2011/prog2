package Uebung_20.Aufgabe_2;

import Uebung_20.Aufgabe_1.Yang;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Main {

  public static HashMap<Integer, Boolean> PrimMap = new HashMap<Integer, Boolean>(); //ergebnis

  public static void main(String[] args){

    Thread_Beispiel pt1 = new Thread_Beispiel(341);
    pt1.start();

    Thread_Beispiel pt2 = new Thread_Beispiel(633910099);
    pt2.start();

    TimerTask myT = new TimerTask() {
      @Override
      public void run() {
        System.out.print("341 -> ");
        System.out.print(PrimMap.get(341));
        System.out.println();
        System.out.print("633910099 -> ");
        System.out.print(PrimMap.get(633910099));
        System.out.println();
      }
    };

    Timer T = new Timer();
    T.schedule(myT, 5000);



  }

}
