package Uebung_20.Beispiele;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Main {

  public static void main(String[] args){

    /*
    Thread_Beispiel pt1 = new Thread_Beispiel(341);
    pt1.start();

    Thread_Beispiel pt2 = new Thread_Beispiel(633910099);
    pt2.start();
    */

    //Lamda Notation
    new Thread(
        () -> {

          System.out.println("Hello World! 1");

        }
    ).start();

    //anonyme Methode
    new Thread(){

      @Override
      public void run(){
        System.out.println("Hello World! 3");
      }

    }.start();

  }

}
