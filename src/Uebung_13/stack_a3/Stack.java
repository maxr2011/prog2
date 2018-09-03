package Uebung_13.stack_a3;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all") //unterdrueckt alle Warnings
public class Stack
{

  List l;

  public Stack(){
    this.l = new ArrayList<>();
  }

  void push(Object e){

    l.add(e);

  }

  Object pop(){

    int index = l.size()-1;

    Object r = l.get(index);
    l.remove(index);

    return r;

  }

}
