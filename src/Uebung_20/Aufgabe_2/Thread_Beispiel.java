package Uebung_20.Aufgabe_2;

import java.util.HashMap;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Thread_Beispiel extends Thread {

  int zahlZumTesten;

  public Thread_Beispiel(int zahlZumTesten) {
      this.zahlZumTesten = zahlZumTesten;
  }

  public boolean testeObPrimzahl() {
      boolean b = true;
      for(int i = 1; i < zahlZumTesten; i++) {

        if(i != 1 && i != zahlZumTesten) {

          if(zahlZumTesten % i == 0) b = false;

        }

      }
      return b;

  }

  @Override
  public void run() {

      boolean istPrimzahl = testeObPrimzahl();
      Main.PrimMap.put(zahlZumTesten, istPrimzahl);

  }



}
