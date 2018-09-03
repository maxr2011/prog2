package Uebung_19.Aufgabe_1;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Main {

  public static void main(String[] args){

    Nährstoffangabe n = new Nährstoffangabe.NährstoffangabeBuilder(12.3, 2)
        .withEiweiß(3.2)
        .withKohlenhydrate(5.4)
        .build();

    System.out.println(n.getPortionsgroesse() + " " + n.getAnzahlPortionen() + " " + n.getEiweiß() + " " + n.getFett() + " " + n.getKohlenhydrate() + " " + n.getNatrium());

  }

}
