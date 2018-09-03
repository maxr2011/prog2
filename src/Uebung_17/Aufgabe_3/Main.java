package Uebung_17.Aufgabe_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maxr2011 on 12.01.2018.
 */
public class Main {

  public static void main(String[] args){

    GenericStack<String> s = new GenericStack<>();
    s.push("Hallo");
    s.push("Welt");

    System.out.println(s.pop());
    System.out.println(s.pop());

  }

}
