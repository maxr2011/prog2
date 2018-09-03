package Tutorium_1;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class PizzaNapolitana extends AbstractPizza {

  public PizzaNapolitana(){
    super();
    this.preis = (int) ((double) preis * 1.15);
  }

  public PizzaNapolitana(int g){
    super(g);
    this.preis = (int) ((double) preis * 1.15);
  }

  public String[] getZutaten(){
    return this.zutaten;
  }

  public int getPreis(){
    return this.preis;
  }

  public int getGrösse(){
    return this.Grösse;
  }

}
