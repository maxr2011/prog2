package Tutorium;

/**
 * Created by maxr2011 on 11.02.2018.
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class GenericQueue <E> implements Iterable<E>{

  private final int MAX_SIZE = 50;

  private List<E> liste = new LinkedList<>();

  public boolean add(E e) {
    if (liste.size() < MAX_SIZE) return false; //falsch
    return true;
  }
  public boolean offer(E e) {
    if (liste.size() < MAX_SIZE) return false; //falsch
    return true;
  }

  public E remove () {
    if (liste.size() > 0) {
      return liste.remove(liste.size() - 1);
    }
    throw new NoSuchElementException("Queue is empty"); //noch nicht richtig
  }
  public E poll() {
    if (liste.size() > 0) {
      return liste.remove(liste.size() - 1);
    }
    return null;
  }

  public E element() {
    if (liste.size() > 0) {
      return liste.get(liste.size() - 1);
    }
    throw new NoSuchElementException("Queue is empty");
  }
  public E peek() {
    if (liste.size() > 0) {
      return liste.get(liste.size() - 1);
    }
    return null;
  }

  @Override
  public Iterator<E> iterator() {
    return new Iterator<E>() {

      private int count = 0;

      @Override
      public void remove() {
        throw new UnsupportedOperationException();
      }

      @Override
      public boolean hasNext() {
        return count < liste.size();
      }

      @Override
      public E next() {
        return liste.get(count++);
      }
    };
  }
}