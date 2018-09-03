package Hilfsmethoden;

import java.util.Scanner;

/**
 * Created by maxr2011 on 14.01.2018.
 */
public class Potenz {

  public static int abs(int a){
    if(a < 0) return -a;
    else return a;
  }

  public static double p(int a, int b){

    if(b > 0){
      return a*p(a, b-1);
    } else if(b == 0) {
      return 1;
    } else {
      return 1/(p(a,abs(b)));
    }

  }

}
