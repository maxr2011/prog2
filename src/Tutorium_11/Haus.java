package Tutorium_11;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by maxr2011 on 13.02.2018.
 */
public class Haus implements Comparable, Iterable, Serializable {

  String Adresse;
  String Besitzer;
  ArrayList<Raum> Raeume = new ArrayList<Raum>();

  public void add(Raum r){
    Raeume.add(r);
  }

  public void remove(Raum r){
    Raeume.remove(r);
  }

  public int compareTo(Object o){

    Haus H = (Haus) o;
    return (this.Raeume.size() < H.Raeume.size() ? -1 : (this.Raeume.size() == H.Raeume.size() ? 0 : 1));

  }

  public Iterator<Raum> iterator(){
    //return Raeume.iterator();

    return new Iterator<Raum>() {
      int i = 0;

      @Override
      public boolean hasNext() {
        return (i < Raeume.size());
      }

      @Override
      public Raum next() {
        return Raeume.get(i++);
      }
    };

  }

}
