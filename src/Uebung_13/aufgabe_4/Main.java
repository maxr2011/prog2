package Uebung_13.aufgabe_4;

/**
 * Created by maxr2011 on 12.01.2018.
 */
public class Main {

  public static void main(String[] args){

    Mensch m = new MenschImpl();
    System.out.println(m.entscheide(Gefahren.GEFAHR_LINKS));

    Roboter r = new RoboterImpl();
    System.out.println(r.entscheide(Gefahren.GEFAHR_RECHTS));

    Cyborg c = new CyborgImpl();
    System.out.println(c.entscheide(Gefahren.GEFAHR_VORNE));
    System.out.println(c.entscheide(Gefahren.GEFAHR_HINTEN));

  }

}
