package Uebung_15.Aufgabe_4;

import java.io.FileNotFoundException;

/**
 * Created by maxr2011 on 09.02.2018.
 */
public class Main {

  public static void main(String[] args) throws FileNotFoundException{

    music_unbuffered mub = new music_unbuffered();
    music_buffered mb = new music_buffered();

    long diff1 = mub.main();
    long diff2 = mb.main();

    double proz = (double) diff2/diff1 * 100;

    System.out.println("Der gepufferte Stream braucht nur "+proz+"% mal so lange wie der ungepufferte Stream.");

  }

}
