package Uebung_12.Aufgabe_zwei;

import java.util.Scanner;

/**
 * Created by maxr2011 on 11.01.2018.
 */
public class TF extends Fragen {

  public TF(String question, String answer){
    super(question, answer);
  }

  @Override
  public void start(){

    System.out.println(question);

    Scanner sc = new Scanner(System.in);
    String ans = sc.nextLine();

    if(ans.equals(answer)){
      System.out.println("Du hast es Richtig!");
    } else {
      System.out.println("Du hast es Falsch!");
    }

  }

}
