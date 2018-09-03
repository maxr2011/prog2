package Hilfsmethoden;

/**
 * Created by maxr2011 on 17.01.2018.
 */

//LIFO
public class Stapel {

  int top;
  Object[] A;

  public Stapel(int n){
    top = 0;
    A = new Object[n];
  }

  boolean Empty(){
    return (top == 0);
  }

  void Push(Object k){
    A[++top] = k;
  }

  Object Pop(){
    if(Empty()) throw new IndexOutOfBoundsException("underflow");
    else return A[(--top)+1];
  }

  Object Top(){
    if(Empty()) throw new IndexOutOfBoundsException("underflow");
    else return A[top];
  }

}
