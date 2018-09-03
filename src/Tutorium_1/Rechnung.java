package Tutorium_1;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class Rechnung {

  Pizza[] pizzas;

  public Rechnung(Pizza[] ps){
    this.pizzas = ps;
  }

  public Rechnung(int Anzahl, Pizza[] ps){
    this.pizzas = ps;
  }

  public Pizza[] getPizzas(){
    return pizzas;
  }

  public int GesamtPreis(){

    int sum = 0;

    for(int i = 0; i < pizzas.length; i++)
      sum += pizzas[i].getPreis();

    return sum;

  }

}
