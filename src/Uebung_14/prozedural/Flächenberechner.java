package Uebung_14.prozedural;

/**
 * Created by maxr2011 on 09.02.2018.
 */
public class Flächenberechner {

  double berechneFläche(Object o){

    if(o.getClass() == Kreis.class){

      Kreis k = (Kreis) o;
      return Math.pow(k.getRadius(), 2) * Math.PI;

    } else if(o.getClass() == Quadrat.class){

      Quadrat q = (Quadrat) o;
      return Math.pow(q.l, 2);

    } else if(o.getClass() == Rechteck.class) {

      Rechteck r = (Rechteck) o;
      return r.l * r.b;

    } else {
      return 0.0;
    }

  }

  double berechneUmfang(Object o){

    if(o.getClass() == Kreis.class){

      Kreis k = (Kreis) o;
      return 2 * Math.PI * k.getRadius();

    } else if(o.getClass() == Quadrat.class){

      Quadrat q = (Quadrat) o;
      return q.l*4;

    } else if(o.getClass() == Rechteck.class){

      Rechteck r = (Rechteck) o;
      return r.b*2 + r.l*2;

    } else {
      return 0.0;
    }

  }

}
