package Tutorium_1;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public abstract class AbstractPizza implements Pizza {

  public AbstractPizza(){
    this.Grösse = 28;
    this.preis = (int) ((double) this.Grösse * 0.33);
  }

  public AbstractPizza(int g){
    if(g == 28 || g == 32 || g == 40){
      this.Grösse = g;
    } else {
      this.Grösse = 28;
    }
    this.preis = (int) ((double) this.Grösse * 0.33);
  }

  String zutaten[];
  int Grösse;
  int preis;

}
