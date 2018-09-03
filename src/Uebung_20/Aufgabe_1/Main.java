package Uebung_20.Aufgabe_1;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Main {

  public static void main(String[] args){

    Yin pt1 = new Yin();
    pt1.run();

    TimerTask myT = new TimerTask() {
      @Override
      public void run() {
        Yang pt2 = new Yang("YinYang");
        pt2.run();
      }
    };

    Timer T = new Timer();
    T.schedule(myT, 250);

  }

}
