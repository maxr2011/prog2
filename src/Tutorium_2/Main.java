package Tutorium_2;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class Main {

  public static void main(String[] args){

    Raum R = new Raum();
    R.setAnzahlDerStudenten(0);

    Queue Q = new Queue(3);
    Q.Enqueue(3);
    Q.Enqueue("Test");

    System.out.println(Q.Dequeue() + " " + Q.Dequeue());

  }

}
