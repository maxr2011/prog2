package Tutorium_3;

import java.io.Serializable;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class Person implements Serializable {

  public String name;
  public String nachname;
  public int alter;

  public Person withName(String n){
    this.name = n;
    return this;
  }

  public Person withNachname(String m){
    this.nachname = m;
    return this;
  }

  public Person withAlter(int a){
    this.alter = a;
    return this;
  }

}
