package Tutorium_4;

import Tutorium_3.Person;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class ReadPerson {

  public static void main(String[] args)
  {
    try
    {
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"));
      Person person = (Person) ois.readObject();
      ois.close();
      System.out.println(person.name + " " + person.nachname + " " + person.alter);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }

}
