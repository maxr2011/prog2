package Uebung_13.stack_a3;

/**
 * Created by maxr2011 on 12.01.2018.
 */
public class Main {

  public static void main(String[] args){
    int a = 1;
    int b = 3;
    String q = "z";

    Stack st = new Stack();

    st.push(a);
    st.push(b);
    st.push(q);

    System.out.println(st.pop());
    System.out.println(st.pop());
    System.out.println(st.pop());

  }

}
