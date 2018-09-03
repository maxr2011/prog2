package Uebung_18.Aufgabe_4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Main {

  public static void main(String[] args){

    // englische Vokabeln mit nur einer deutschen Bedeutung
    HashMap<String, String> m = new HashMap<String, String>();
    m.put("to clean", "reinigen");
    m.put("to expand", "vergrößern");

    System.out.print("to clean ->");
    System.out.println(m.get("to clean"));

    // englische Vokabeln mit mehreren deutschen Bedeutungen
    // Kombination von einer ArrayList als Value in einer HashMap (key Value)
    HashMap<String, ArrayList<String>> multiMap = new HashMap<String, ArrayList<String>>();
    ArrayList<String> AL1 = new ArrayList<String>();
    ArrayList<String> AL2 = new ArrayList<String>();
    AL1.add("reinigen"); AL1.add("säubern"); AL1.add("putzen");
    AL2.add("vergrößern"); AL2.add("wachsen");

    multiMap.put("to clean", AL1);
    multiMap.put("to expand", AL2);

    System.out.print("to clean->");
    for(String s : multiMap.get("to clean")){
      System.out.print(s + " ");
    }

  }

}
