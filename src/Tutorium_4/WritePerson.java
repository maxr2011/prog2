package Tutorium_4;

import Tutorium_3.Person;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class WritePerson {

  public static void main(String[] args)
  {
    try
    {
      Person p = new Person()
          .withName("Joe")
          .withNachname("Don")
          .withAlter(23);

      System.out.println(p.name + " " + p.nachname + " " + p.alter);
      ObjectOutputStream oos = new ObjectOutputStream(
          new FileOutputStream("person.dat"));
      oos.writeObject(p);
      oos.close();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }

}
