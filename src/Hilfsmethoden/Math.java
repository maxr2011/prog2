package Hilfsmethoden;

import java.security.InvalidParameterException;

/**
 * Created by maxr2011 on 15.01.2018.
 */
public class Math extends Potenz {

  // Variablen
  public static int z;		// Anzahl der Werte
  public static double[] w;	// Wertearray

  public static int zx;		// Wird für eine Funktion gebraucht
  public static double zy;
  public static boolean zz = true;

  public static double min;	// Minimum
  public static double max;	// Maximum
  public static double A;		// Arithmetisches Mittel
  public static double SA;	// Standardabweichung

  // Kleinster Wert
  public static double Min(double[] x){

    int l = x.length;	// Länge des Arrays
    if(l < 1) return 0;	// leeres Array

    double y = x[0];

    for(int i = 0; i < l; i++){
      if(x[i] < y)
        y = x[i];
    }

    return y;

  }

  // Größter Wert
  public static double Max(double[] x){

    int l = x.length;	// Länge des Arrays
    if(l < 1) return 0;	// leeres Array

    double y = x[0];

    for(int i = 0; i < l; i++){
      if(x[i] > y)
        y = x[i];
    }

    return y;

  }

  // Arithmetisches Mittel
  public static double AM(double[] x){

    int l = x.length;	// Länge des Arrays
    if(l < 1) return 0;	// leeres Array

    double sum = 0; // Neutrales Element der Addition

    for(int i = 0; i < l; i++){
      sum += x[i];
    }

    return (sum / l);

  }

  // Betrag einer Zahl
  public static int abs(int x){

    if(x < 0) return -x;
    else return x;

  }

  // Potenzfunktion rekursiv
  public static double pow(double ba, int ex){

    if(ex == 0) return 1; //Neutrales Element der Multiplikation
    else if(ex < 0) return (1 / pow(ba, abs(ex))); // Bei negativem Exponent

    else return ba * pow(ba, (ex-1));

  }

  public static double pow(int ba, int ex){
    return p(ba, ex);
  }

  // Methode um Länge der Zahl zu ermitteln
  public static int laenge(int y) {

    int s = 0;
    int t = 1;

    while(y/t != 0) {
      ++s;
      t *= 10;
    }

    return s;
  }

  // Wurzelfunktion rekursiv
  public static double sqrt(double x){

    if(zz) {
      // wird nur bei der ersten Rekursion ausgeführt
      zx = 1000;							// Annäherung (ab 9 ändert sich nicht mehr viel)
      zy = laenge((int) x) * pow(10, 2);	// x0
      zz = false;
    }

    if(x == 0) 		// Wurzel von 0
      return 0;
    else if(x < 0) 	// Wurzel von negativen Zahlen (geht nicht)
      throw new InvalidParameterException("Die Wurzel einer negativen Zahl existiert nicht im reelen Zahlenbereich!");
    else {			// Wurzel einer positiven Zahl

      zy = (1.0 / 2.0) * (zy + (x / zy)); // Formel (Quelle: Wikipedia)

      if(zx > 0){
        zx--;
        sqrt(x);	// rekursiver Aufruf (x bleibt erhalten)
        return zy;
      } else {
        return zy;
      }

    }

  }

  // Fakultaet
  public static int fak(int a){

    int p = 1;
    for(int i = a; i > 0; i--)
      p *= a--;
    return p;

  }

  // Array sortieren mit MinSort
  public static int[] MinSort(int[] a){

    if(isSorted(a)) return a;
    else {
      for(int i = 0; i < a.length-1; i++){
        if(a[i] > a[i+1]){
          int z = a[i+1];
          a[i+1] = a[i];
          a[i] = z;
        }
      }
      return MinSort(a);
    }

  }

  // prüft ob Array sortiert
  public static boolean isSorted(int[] a){

    for(int i = 0; i < a.length-1; i++){
      if(a[i] > a[i+1]) return false;
    }
    return true;

  }

  // prüft auf doppelte elemnte
  public static boolean dbl(int[] a){

    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a.length; j++){

        if(i!=j){
          if(a[i] == a[j]) return true;
        }

      }
    }

    return false;

  }

  // Array ausgeben
  public static void echoA(int[] a){

    for(int i = 0; i < a.length; i++)
      System.out.print("a["+i+"] = "+a[i]+"; ");

  }

  // zu Aufgabe 2
  // Standardabweichung
  public static double s(double[] x){

    int l = x.length;	// Länge des Arrays
    if(l < 1) return 0;	// leeres Array

    double sum = 0; // Neutrales Element der Addition
    double m = A;
    m = AM(x); // wird hier noch mal neu berechnet

    for(int i = 0; i < l; i++){
      sum += pow( (x[i] - m) , 2);
    }

    sum /= l;

    return sqrt(sum);

  }

}
