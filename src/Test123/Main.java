package Test123;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class Main {

  public static void main(String[] args){
    GenericStackTest<String> GS = new GenericStackTest<String>();

    GS.add("Hello");
    GS.add("World!");

    GS.output();

  }

}
