package Altklausur.Aufgabe_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by maxr2011 on 13.02.2018.
 */
public class WortVorkommen {

  Map<Wort, List<Position>> WPM;

  public WortVorkommen(){
    WPM = new HashMap<Wort, List<Position>>();
  }

  void einfuegen(Wort w, Position p){
    if(WPM.get(w) != null){
      ArrayList<Position> AL = new ArrayList<Position>();
      AL.add(p);
      WPM.put(w, AL);
    }
    WPM.get(w).add(p);
  }

  Collection<Position> holeAlle(Wort w){
    Collection<Position> cp = new ArrayList<>();
    for(Position pp : WPM.get(w)){
      cp.add(pp);
    }
    return cp;
  }

  Position holeLetzte(Wort w){
    List<Position> pal = WPM.get(w);
    Collections.sort(pal);
    return pal.get(pal.size());
  }

}
