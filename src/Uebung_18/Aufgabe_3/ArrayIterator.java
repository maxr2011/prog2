package Uebung_18.Aufgabe_3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class ArrayIterator implements Iterator
{
  private Object array[];
  private int    pos = 0;

  public ArrayIterator( Object anArray[] )
  {
    array = anArray;
  }

  public boolean hasNext()
  {
    return pos < array.length;
  }

  public Object next() throws NoSuchElementException
  {
    if ( hasNext() )
      return array[pos++];
    else
      throw new NoSuchElementException();
  }

  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}
