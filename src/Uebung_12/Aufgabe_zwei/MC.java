package Uebung_12.Aufgabe_zwei;

import java.security.InvalidParameterException;
import java.util.Scanner;

/**
 * Created by maxr2011 on 11.01.2018.
 */
public class MC extends Fragen {

  Object[] ans;

  public MC(String question, String answer, Object[] ans){
    super(question, answer);
    this.ans = ans;
  }

  @Override
  public void start(){

    System.out.println(question);

    Scanner sc = new Scanner(System.in);
    String aw = sc.nextLine();

    boolean is_in_List = false;

    for(int i = 0; i < ans.length; i++){
      if(ans[i].equals(aw)){
        is_in_List = true;
      }
    }

    if(!is_in_List){
      throw new InvalidParameterException("Answer not in List!");
    }

    if(answer.charAt(0) == aw.charAt(0)){
      System.out.println("Du hast es Richtig!");
    } else {
      System.out.println("Du hast es Falsch!");
    }

  }

}
