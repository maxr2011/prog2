package Uebung_14.oo;

/**
 * Created by maxr2011 on 09.02.2018.
 */
public class Circle implements Shape {

  int r;

  public double calculateArea(){

    return Math.pow(r,2) * Math.PI;

  }

  public double calculateU(){

    return 2 * Math.PI * r;

  }

}
