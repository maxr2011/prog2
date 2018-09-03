package Uebung_12.Aufgabe_drei;

import Uebung_12.Aufgabe_drei.Angestellter;
import java.security.InvalidParameterException;

/**
 * Created by maxr2011 on 11.01.2018.
 */
public class Abteilungsleiter extends Angestellter {

  double Gehaltsfaktor = 2.0;

  public Abteilungsleiter(int id, String nachname, String vorname, int Grundgehalt, String Geburtsdatum){
    super(id, nachname, vorname, Grundgehalt, Geburtsdatum);
    setGehaltsfaktor(this.Gehaltsfaktor);
  }

  public void befoerdern(Angestellter A) {

    if(A != null){
      A.Gehaltsfaktor += A.Gehaltsfaktor * 0.1;
    } else {
      throw new InvalidParameterException("Angestellter existiert nicht!");
    }

  }

}
