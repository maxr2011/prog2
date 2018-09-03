package Uebung_18.Beispiele;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Raum {

  private final int KAPAZITAET = 50;
  private HashMap<String,Student> studenten = new HashMap<>();

  /*
  public void betrete(Student s){
    if (studenten.size() < KAPAZITAET)
      studenten.put(s.getId(), s);
  }
  public void verlasse(Student s){
    studenten.remove(s.getId());
  }
  */
  public Student findeStudent(String id){
    return studenten.get(id);
  }

}
