package Altklausur.Aufgabe_1;

/**
 * Created by maxr2011 on 12.02.2018.
 */
public class IBANCheck {

  boolean ibanCheck(String IBAN) throws FalscheIBANException {

    boolean la = ("D".equals(IBAN.charAt(0))) && ("E".equals(IBAN.charAt(0)));
    boolean le = IBAN.length() == 22;

    if(la && le) return true;
    else throw new FalscheIBANException(IBAN + " ist keine gültige IBAN.");

  }

}
