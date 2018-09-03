package Uebung_18.Beispiele;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class LinkedListBeispiel {

  public static void main(String[] args){

    LinkedList<Integer> LL = new LinkedList();

    LL.add(1);
    LL.add(4);
    LL.add(7);

    System.out.println(LL.size());

    // for each wie bei Array List
    for(int i : LL){

      System.out.println(i);

    }

    // for each als Iterator
    Iterator<Integer> iterator = LL.iterator();
    while(iterator.hasNext()){
      int i = iterator.next();
      System.out.println(i);
    }

  }

}
