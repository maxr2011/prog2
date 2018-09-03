package Hilfsmethoden;

/**
 * Created by maxr2011 on 17.01.2018.
 */
public class Schlange {

  int tail;
  int head;
  int length;
  Object A[];

  public Schlange(int n){
    this.tail = 1;
    this.head = 1;
    this.length = n;
    A = new Object[n];
  }

  public boolean Empty(){
    return (head == tail);
  }

  public boolean Full(){
    return (tail == head-1 || head == 1 && tail == length-1);
  }

  public void Enqueue(Object k){

    if(Full()) throw new IndexOutOfBoundsException("overflow");

    A[tail] = k;
    if(tail == A.length) tail = 1;
    else tail++;
  }

  public Object Dequeue(){

    if(Empty()) throw new IndexOutOfBoundsException("underflow");

    Object k = A[head];
    if(head == A.length) head = 1;
    else head++;
    return k;
  }

}
