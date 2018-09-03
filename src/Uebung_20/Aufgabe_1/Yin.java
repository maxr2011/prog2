package Uebung_20.Aufgabe_1;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Yin extends Thread {

  @Override
  public void run(){

    TimerTask meinTimerTask = new TimerTask() {
      @Override
      public void run() {
        System.out.println("Yin");
      }
    };

    Timer meinTimer = new Timer();
    meinTimer.schedule(meinTimerTask, 0, 500);

  }

}
