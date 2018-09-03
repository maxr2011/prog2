package Hilfsmethoden;

/**
 * Created by maxr2011 on 17.01.2018.
 */
public class Liste {

  private Item head;

  public Liste() {
    head = null;
  }

  public Item insert(Object k) {
    Item x = new Item(k, head);
    if (head != null) {
      head.setPrev(x);
    }
    head = x;
    return x;
  }

  public Item getHead() { return head; }

  public Item search(Object k) {
    Item x = head;
    while (x != null && x.getKey() != k) {
      x = x.getNext();
    }
    return x;
  }

  public void delete(Item x) {
    if (x == null) System.out.println("Fehler!");
    Item prev = x.getPrev();
    Item next = x.getNext();
    if (prev != null) prev.setNext(next);
    else head = next;
    if (next != null) next.setPrev(prev);
  }

}
