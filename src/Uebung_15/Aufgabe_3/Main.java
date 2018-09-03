package Uebung_15.Aufgabe_3;

import javax.xml.bind.ValidationException;

/**
 * Created by maxr2011 on 09.02.2018.
 */
public class Main {

  public static void main(String[] args) throws ValidationException {

    Person p = new Person("Max", "Rehberger", "Peter-Schneider-Straße", "5", "97074", "Würzburg");
    Person q = new Person("Max", "Mustermann", "Musterstraße", "O1", "11111", "Stadt");

  }

}
