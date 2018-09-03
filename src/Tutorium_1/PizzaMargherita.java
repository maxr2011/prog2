package Tutorium_1;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class PizzaMargherita extends AbstractPizza {

  public PizzaMargherita(){
    super();
  }

  public PizzaMargherita(int g){
    super(g);
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
