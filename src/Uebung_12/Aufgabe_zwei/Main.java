package Uebung_12.Aufgabe_zwei;

/**
 * Created by maxr2011 on 11.01.2018.
 */
public class Main {

  public static void main(String[] args){

    // Aufgabe 2

    Fragen a = new TF("Was ist die Hauptstadt von Deutschland?", "Berlin");
    a.start();

    String[] aw_s = {"A", "B", "C", "D"};

    Fragen b = new MC("Wie viele Protonen hat ein Wasserstoff‐Atom?", "C", aw_s);
    b.start();


  }

}
