package Uebung_17.Aufgabe_3;

import java.util.ArrayList;
import java.util.List;

public class GenericStack<T> {

  List l;

  public GenericStack(){
    this.l = new ArrayList<T>();
  }

  public void push(Object e){

    l.add(e);

  }

  public void output(){

    for(Object e : l){
      System.out.println((T) e);
    }

  }

  public Object pop(){

    int index = l.size()-1;

    Object r = l.get(index);
    l.remove(index);

    return r;

  }

}
