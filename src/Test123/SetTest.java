package Test123;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by maxr2011 on 13.02.2018.
 */
public class SetTest {

  public static void main(String[] args){

    Set<Integer> Se = new TreeSet<>();

    Se.add(1);
    Se.add(3);
    Se.add(3);
    Se.add(3);
    Se.add(8);

    Iterator<Integer> it = Se.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }

  }

}
