package Uebung_12.Aufgabe_drei;

/**
 * Created by maxr2011 on 11.01.2018.
 */
public class Angestellter {

  int id;
  String nachname;
  String vorname;
  int Grundgehalt;
  double Gehaltsfaktor = 1.0;
  String Geburtsdatum;

  public Angestellter(int id, String nachname, String vorname, int Grundgehalt, String Geburtsdatum){
    this.id = id;
    this.nachname = nachname;
    this.vorname = vorname;
    this.Grundgehalt = Grundgehalt;
    this.Geburtsdatum = Geburtsdatum;
  }

  void setId(int id) {this.id = id;}
  void setNachname(String nachname) {this.nachname = nachname;}
  void setVorname(String vorname) {this.vorname = vorname;}
  void setGrundgehalt(int grundgehalt) {this.Grundgehalt = grundgehalt;}
  void setGeburtsdatum(String geburtsdatum) {this.Geburtsdatum = geburtsdatum;}
  void setGehaltsfaktor(double gehaltsfaktor) {this.Gehaltsfaktor = gehaltsfaktor;}

  int getId(){return id;}
  String getNachname(){return nachname;}
  String getVorname(){return vorname;}
  int getGrundgehalt(){return Grundgehalt;}
  double getGehalt(){return (Grundgehalt*Gehaltsfaktor);}
  double getGehaltsfaktor(){return Gehaltsfaktor;}
  String getGeburtsdatum(){return Geburtsdatum;}

}
