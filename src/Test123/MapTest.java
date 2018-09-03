package Test123;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by maxr2011 on 12.02.2018.
 */
public class MapTest {

  public static void main(String[] args){

    // einfache
    Map<Integer, String> hm;
    hm = new HashMap<Integer, String>();

    hm.put(1, "Max");
    hm.put(2, "Thomas");

    for(int i = 1; i < 3; i++){
      System.out.println(hm.get(i));
    }

    System.out.println();

    // MultiMap
    HashMap<Integer, ArrayList<String>> hmulti;
    hmulti = new HashMap<Integer, ArrayList<String>>();
    ArrayList<String> AL;
    AL = new ArrayList<String>();

    AL.add("Max");
    AL.add("Mustermann");

    hmulti.put(1, AL);

    for(String s : hmulti.get(1)){
      System.out.print(s + " ");
    }

  }

}
