package Uebung_15.Bruch;

/**
 * Created by maxr2011 on 17.01.2018.
 */
public class Bruch {

  int Zaehler;
  int Nenner;
  double Ergebnis;

  public Bruch(int z, int n) throws ArithmeticException{

    if(n == 0) throw new ArithmeticException("Der Nenner darf nicht 0 sein!");

    Zaehler = z;
    Nenner = n;

    Ergebnis = (double) Zaehler / Nenner;

  }

}
