package Uebung_14.oo;

/**
 * Created by maxr2011 on 09.02.2018.
 */
public class Rectangle implements Shape {

  int l;
  int b;

  public double calculateArea(){

    return l*b;

  }

  public double calculateU(){

    return (2*l) + (2*b);

  }

}
