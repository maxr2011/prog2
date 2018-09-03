package Hilfsmethoden;

/**
 * Created by maxr2011 on 17.01.2018.
 */
public class Item {

  private Object key;
  private Item prev;
  private Item next;

  public Item(Object k, Item p) {
    this.key = k;
    this.next = p;
    this.prev = null;
  }

  public void setPrev(Item p) { prev = p; }
  public void setNext(Item p) { next = p; }
  public Object getKey() { return key; }
  public Item getPrev() { return prev; }
  public Item getNext() { return next; }

}
