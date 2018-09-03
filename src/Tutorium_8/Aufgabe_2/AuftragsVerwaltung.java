package Tutorium_8.Aufgabe_2;

import Tutorium_8.Aufgabe_1.GenericStack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by maxr2011 on 12.02.2018.
 */
public class AuftragsVerwaltung implements Iterable {

  List<Auftrag> Li;

  public AuftragsVerwaltung(){
    Li = new LinkedList<Auftrag>();
  }

  public void addAuftrag(Auftrag a){
    Li.add(a);
  }


  public Iterator<Auftrag> iterator(){
    return Li.iterator();
  }

}
