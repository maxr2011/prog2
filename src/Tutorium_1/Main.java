package Tutorium_1;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class Main {

  public static void main(String[] args){

    // Pizza
    Pizza PM1 = new PizzaMargherita();
    Pizza PM2 = new PizzaMargherita(40);
    Pizza PM3 = new PizzaMargherita(33);

    Pizza PN1 = new PizzaNapolitana();
    Pizza PN2 = new PizzaNapolitana(40);
    Pizza PN3 = new PizzaNapolitana(33);

    System.out.println(PM1.getGrösse() + " " + PM2.getGrösse() + " " + PM3.getGrösse());
    System.out.println(PM1.getPreis() + " " + PM2.getPreis() + " " + PM3.getPreis());

    System.out.println();

    System.out.println(PN1.getGrösse() + " " + PN2.getGrösse() + " " + PN3.getGrösse());
    System.out.println(PN1.getPreis() + " " + PN2.getPreis() + " " + PN3.getPreis());

    System.out.println();

    // Rechnung
    Pizza[] p1 = new Pizza[3]; p1[0] = PM1; p1[1] = PM2; p1[2] = PM3;
    Pizza[] p2 = new Pizza[3]; p2[0] = PN1; p2[1] = PN2; p2[2] = PN3;

    Rechnung R1 = new Rechnung(p1);
    Rechnung R2 = new Rechnung(p2);

    System.out.println("Summe Rechnung 1: "+R1.GesamtPreis());
    System.out.println("Summe Rechnung 2: "+R2.GesamtPreis());

    System.out.println();

    // Buchhaltung
    Buchhaltung BH = new Buchhaltung();
    BH.add(R1); BH.add(R2);

    BH.output();

  }

}
