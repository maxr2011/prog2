package Uebung_14.prozedural;

/**
 * Created by maxr2011 on 09.02.2018.
 */
public class Main {

  public static void main(String[] args){

    Kreis a = new Kreis();
    a.r = 2;

    Quadrat b = new Quadrat();
    b.l = 2;

    Rechteck c = new Rechteck();
    c.b = 3;
    c.l = 5;

    Flächenberechner F = new Flächenberechner();

    System.out.println(F.berechneFläche(a));
    System.out.println(F.berechneFläche(b));
    System.out.println(F.berechneFläche(c));

  }

}
