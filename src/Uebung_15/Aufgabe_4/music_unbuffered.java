package Uebung_15.Aufgabe_4;

import java.io.FileNotFoundException;

/**
 * Created by maxr2011 on 09.02.2018.
 */
public class music_unbuffered {

  long main() throws FileNotFoundException {

    long startTime = System.currentTimeMillis();

    DateiKopieren q = new DateiKopieren();
    //Unbufferd wie beim Beispiel in dem das Bild kopiert wurde
    //q.copy("lalala.mp3", "tralala.mp3"); // Test mit einer Datei die es nicht gibt
    q.copy("cantina_band.mp3", "cantina_band_unbuffered.mp3");

    long endTime = System.currentTimeMillis();

    long diffTime = endTime - startTime;

    System.out.println("Der Ungepufferte Stream hat "+diffTime+" Millisekunden gebraucht um die Musikdatei zu kopieren.");

    return diffTime;

  }

}
