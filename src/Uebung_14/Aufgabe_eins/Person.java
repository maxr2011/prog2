package Uebung_14.Aufgabe_eins;

/**
 * Created by maxr2011 on 12.01.2018.
 */
public class Person {

  private String vorname;
  private String nachname;

  public Person(String id) {
    init(id);
  }

  public void init(String id){

  }

  public String getVorname(){
    return vorname;
  }

  public String getNachname(){
    return nachname;
  }

  public void setVorname(String vorname) {
    this.vorname = vorname;
  }

  public void setNachname(String nachname) {
    this.nachname = nachname;
  }

}
