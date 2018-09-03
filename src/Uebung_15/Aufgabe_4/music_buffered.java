package Uebung_15.Aufgabe_4;

import java.io.FileNotFoundException;

/**
 * Created by maxr2011 on 09.02.2018.
 */
public class music_buffered {

  long main() throws FileNotFoundException {

    long startTime = System.currentTimeMillis();

    DateiKopieren q = new DateiKopieren();
    //Buffered
    DateiKopieren_buffered cb = new DateiKopieren_buffered();
    cb.copy("cantina_band.mp3", "cantina_band_buffered.mp3");


    long endTime = System.currentTimeMillis();

    long diffTime = endTime - startTime;

    System.out.println("Der Gepufferte Stream hat "+diffTime+" Millisekunden gebraucht um die Musikdatei zu kopieren.");

    return diffTime;

  }

}
