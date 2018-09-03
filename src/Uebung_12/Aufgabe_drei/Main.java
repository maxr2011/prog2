package Uebung_12.Aufgabe_drei;

/**
 * Created by maxr2011 on 11.01.2018.
 */
public class Main {

  public static void main(String[] args){

    // Aufgabe 3

    Angestellter A = new Angestellter(37, "Gardlo", "Stefan", 1800, "26.07.1989");
    Abteilungsleiter B = new Abteilungsleiter(3, "Renninger", "Bernd", 2000, "25.02.1975");

    System.out.println(A.getGehalt());
    System.out.println(B.getGehalt());

    B.befoerdern(A);
    System.out.println(A.getGehalt());

  }

}
