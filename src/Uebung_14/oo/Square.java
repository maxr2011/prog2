package Uebung_14.oo;

/**
 * Created by maxr2011 on 09.02.2018.
 */
public class Square implements Shape {

  int l;

  public double calculateArea(){

    return Math.pow(l,2);

  }

  public double calculateU(){

    return l*4;

  }

}
