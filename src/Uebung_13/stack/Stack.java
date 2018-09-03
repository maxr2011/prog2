package Uebung_13.stack;

import java.util.ArrayList;

@SuppressWarnings("all") //unterdrueckt alle Warnings
public class Stack extends ArrayList
{

  void push(Object e){

    this.add(e);

  }

  Object pop(){

    int index = this.size()-1;

    Object r = this.get(index);
    this.remove(index);

    return r;

  }

}
