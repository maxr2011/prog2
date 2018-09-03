package Tutorium_8.Aufgabe_1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by maxr2011 on 12.02.2018.
 */
public class GenericStack<E> implements Iterable,Serializable {

  ArrayList<E> AL;

  public GenericStack(){
    AL = new ArrayList<E>();
  }

  public void add(E el){
    AL.add(el);
  }

  public void remove(E el){
    AL.remove(el);
  }

  public E remove(){
    E el = AL.get(AL.size() - 1);
    this.remove(el);
    return el;
  }

  public void output(){

    for(E el: AL){
      System.out.println(el);
    }

  }

  public boolean isEmpty(){
    return AL.isEmpty();
  }

  @Override
  public Iterator<E> iterator() {
    if(this.isEmpty()){
      System.out.println("Stack is empty!");
      return null;
    } else {
      return AL.iterator();
    }
  }

}
