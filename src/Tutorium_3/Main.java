package Tutorium_3;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class Main {

  public static void main(String[] args){

    Person[] p;

    ReadCSV c = new ReadCSV("T3A1_Person.csv");

    p = c.returnPerson();

    for(int i = 0; i < p.length; i++){

      System.out.println("name: "+p[i].name + " nachname: "+p[i].nachname + " alter: "+p[i].alter);

    }

  }

}
