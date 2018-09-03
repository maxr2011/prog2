package Tutorium_1;

import java.util.ArrayList;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class Buchhaltung {

  ArrayList<Rechnung> AL;

  public Buchhaltung(){
    AL = new ArrayList();
  }

  public void add(Rechnung e){
    AL.add(e);
  }

  public void remove(Rechnung f){
    AL.remove(f);
  }

  public void output(){

    int j = 1;
    for(Rechnung i : AL){
      System.out.println("Rechnung "+j+": "+i.GesamtPreis()+"");
      j++;
    }

  }

}
