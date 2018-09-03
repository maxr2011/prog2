package Test123;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by maxr2011 on 12.02.2018.
 */
public class MapAL {

  public static void main(String[] args){

    List<Map<String, String>> ALM;
    ALM = new ArrayList<Map<String, String>>();

    ALM.add(new HashMap<String, String>());
    ALM.get(0).put("Hello", "World");

    Iterator<Map<String, String>> it = ALM.iterator();
    while(it.hasNext()){
      System.out.println(it.next().get("Hello"));
    }

    String[] abc = new String[3];
    abc[0] = "Hi";
    abc[1] = "Hallo";
    abc[2] = "Hey";

    for(String s : abc){
      System.out.println(s);
    }

  }

}
