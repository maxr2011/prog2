package Uebung_18.Beispiele;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class SetBeispiel {

  public static void main(String[] args){

    Set<Integer> S = new HashSet();

    S.add(1);
    S.add(2);
    S.add(2); // wird nicht eingefügt, da 2 schon vorhanden im Set
    S.add(4);

    System.out.println(S.size());

    //for each wie bei AL und LL
    for(int i : S){
      System.out.println(i);
    }

  }

}
