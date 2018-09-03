package Hilfsmethoden;

/**
 * Created by maxr2011 on 17.01.2018.
 */
public class Main {

  public static void main(String[] args){

    Stapel stapel = new Stapel(3);
    stapel.Push(1);
    stapel.Push(3);
    System.out.println(stapel.top + " "+ stapel.Pop());

    System.out.println();

    Schlange schlange = new Schlange(5);
    schlange.Enqueue(5);
    schlange.Enqueue(7);
    schlange.Enqueue(9);
    System.out.println(schlange.head + " "+schlange.tail+" "+schlange.Dequeue());

    System.out.println();

    Liste L = new Liste();
    L.insert("test");
    L.insert("Banane");
    System.out.println(L.getHead() + " "+L.search("test")+" ");


  }

}
