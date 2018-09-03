package Test123;

import java.util.ArrayList;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class GenericStackTest<E> {

  ArrayList<E> AL;

  public GenericStackTest(){
    AL = new ArrayList<E>();
  }

  void add(E el){
    AL.add(el);
  }

  void remove(E el){
    AL.remove(el);
  }

  void output(){

    for(E el: AL){
      System.out.println(el);
    }

  }

}
