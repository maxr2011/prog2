package Test123;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class ArrayListTest {

  public static void main(String[] args){

    ArrayList<Integer> AL = new ArrayList<Integer>();
    AL.add(1);
    AL.add(3);
    AL.add(7);
    AL.add(5);
    Collections.sort(AL);

    /*
    for(int i : AL){
      System.out.println(i);
    }
    */

    Iterator<Integer> it = AL.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }

  }

}
