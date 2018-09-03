package Uebung_13.stack_a3b;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all") //unterdrueckt alle Warnings
public class StackImpl extends AbstractStack implements Stack {

  List l;

  public StackImpl(){
    this.l = new ArrayList<>();
  }

  public void push(Object e){

    l.add(e);

  }

  public Object pop(){

    int index = l.size()-1;

    Object r = l.get(index);
    l.remove(index);

    return r;

  }

  public int size(){

    return l.size();

  }

}
