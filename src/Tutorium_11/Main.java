package Tutorium_11;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by maxr2011 on 13.02.2018.
 */
public class Main {

  public static void main(String[] args){

    // Haus erstellen serialisieren
    Haus h1 = new Haus();

    Raum r1 = new Raum();
    r1.Bezeichnung = "I.2.15";
    r1.Stock = 2;

    Raum r2 = new Raum();
    r2.Bezeichnung = "I.3.15";
    r2.Stock = 3;

    h1.add(r1); h1.add(r2);

    Haus h2 = new Haus();

    try(ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Haus.dat"))) {
      o.writeObject(h1);
      o.writeObject(h2);
    } catch (FileNotFoundException f){

    } catch (IOException i){

    }

    // Deserialisieren
    try(ObjectInputStream i = new ObjectInputStream(new FileInputStream("Haus.dat"))){

      ArrayList<Haus> AL = new ArrayList<Haus>();
      Object ob;

      try {
        while ((ob = i.readObject()) != null) {

          AL.add((Haus) ob);

        }
      } catch (EOFException eof){
        eof.printStackTrace();
      }

      for(Haus h : AL){
        Iterator<Raum> it = h.iterator();
        while(it.hasNext()){
          System.out.println(it.next().Bezeichnung);
        }
      }

    } catch (FileNotFoundException | ClassNotFoundException g){
      g.printStackTrace();
    } catch (IOException e){
      e.printStackTrace();
    }



  }

}
