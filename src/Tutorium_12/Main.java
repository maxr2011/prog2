package Tutorium_12;

/**
 * Created by maxr2011 on 13.02.2018.
 */
public class Main {

  public static void main(String[] args){

    Mannschaft m = new Mannschaft();
    Spieler sp = new Spieler("herbert", 23);
    Spieler sp2 = new Spieler("Rudolf", 3);

    m.add(sp);
    m.add(sp2);

    System.out.println(m.P("herbert").rank);
    System.out.println(m.P("Rudolf").rank);

  }

}
