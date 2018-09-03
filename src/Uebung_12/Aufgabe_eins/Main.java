package Uebung_12.Aufgabe_eins;

/**
 * Created by maxr2011 on 11.01.2018.
 */
public class Main {

  public static void main(String[] args){

    // Aufgabe 1
    Person[] pe = new Person[100];

    Person s = new Student();
    Person p = new Professor();

    for(int i = 0; i < pe.length/2; i=i+0){
      pe[i] = s;
      pe[i++].gibTaetigkeitAus();

      pe[i] = p;
      pe[i++].gibTaetigkeitAus();
    }



  }

}
