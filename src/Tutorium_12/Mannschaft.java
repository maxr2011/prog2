package Tutorium_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Created by maxr2011 on 13.02.2018.
 */
public class Mannschaft implements Comparable {

  Map<String, Spieler>  ma;

  public Mannschaft() {
    ma = new HashMap<String, Spieler>();
  }

  public void add(Spieler p){
    ma.put(p.Name, p);
  }

  public Spieler P(String name){
    return ma.get(name);
  }

  public int durchschnitt(){
    ArrayList<Spieler> AL = new ArrayList<Spieler>();
    int sum = 0;
    for (Entry e : ma.entrySet()){
      AL.add((Spieler) e.getValue());
      sum += ((Spieler) e.getValue()).rank;
    }
    return sum/ AL.size();
  }

  public int compareTo(Object o){
    Mannschaft m = (Mannschaft) o;
    return (this.durchschnitt() < m.durchschnitt() ? -1 : (this.durchschnitt() == m.durchschnitt() ? 0 : 1));
  }

}
