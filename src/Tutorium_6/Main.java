package Tutorium_6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class Main {

  public static void main(String[] args){

    ArrayList<String> AL = new ArrayList();

    Scanner sc = new Scanner(System.in);
    String Text;

    System.out.print("> ");

    while(!((Text=sc.nextLine()).equals("list"))){

      System.out.print("> ");
      AL.add(Text);

    }

    int k; String zw = "";

    for(String s : AL){

      if(!(s.equals(zw))) {

        k = 0;
        for (String q : AL) {
          if (s.equals(q)) {
            k++;
            zw = s;
          }
        }
        System.out.print(s + " " + k + ", ");

      }
    }

  }

}
