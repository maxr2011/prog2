package Uebung_15.Aufgabe_3;

import javax.xml.bind.ValidationException;

/**
 * Created by maxr2011 on 09.02.2018.
 */
public class Person {

  String vorname;
  String nachname;
  Adresse adresse;

  public Person(String vn, String nn, String strasse, String hausnummer, String postleitzahl, String ort ) throws ValidationException {

    boolean bed1 = (Character.isUpperCase(vn.charAt(0))) && (Character.isUpperCase(strasse.charAt(0))) && (Character.isUpperCase(ort.charAt(0)));
    boolean bed2 = Character.isDigit(hausnummer.charAt(0));

    if(!bed1 || !bed2){
      throw new ValidationException("Bedingungen nicht erfüllt!");
    }

    this.vorname = vn;
    this.nachname = nn;
    this.adresse = new Adresse();
    this.adresse.strasse = strasse;
    this.adresse.hausnummer = Integer.valueOf(hausnummer);
    this.adresse.postleitzahl = Integer.valueOf(postleitzahl);
    this.adresse.ort = ort;

  }

}
