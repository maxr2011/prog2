package Tutorium;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class Main {

  public static void main(String[] args){

    // Queue
    /*
    GenericQueue<String> GQ = new GenericQueue();
    GQ.add("Test");
    GQ.add("Test2");
    */

    // Auto
    try (ObjectOutputStream oos = new ObjectOutputStream(
        new FileOutputStream("Autos.txt")))
    {
      Auto a1 = new Auto(500, "BMW", "M5", 2012)
          .withKennzeichen("WÜ-HU1");
      Auto a2 = new Auto(300, "Audi", "Q7", 2015)
          .withKennzeichen("WÜ-HU2");
      Auto a3 = new Auto(700, "Porsche", "911", 2017)
          .withKennzeichen("WÜ-HU3");

      System.out.println(a3.compareTo(a1));



      oos.writeObject(a1);
      oos.writeObject(a2);
      oos.writeObject(a3);

    }
    catch (Exception e)
    {
      e.printStackTrace();
    }


  }

}
