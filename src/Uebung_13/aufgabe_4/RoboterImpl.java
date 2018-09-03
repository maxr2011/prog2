package Uebung_13.aufgabe_4;

/**
 * Created by maxr2011 on 12.01.2018.
 */
public class RoboterImpl extends AbstractWesen implements Roboter {

  public void aufladen(){
    //do something
  };

  public void warten(){
    //do something
  };

  public Entscheidungen entscheide(Gefahren g){

    if(g == Gefahren.GEFAHR_LINKS){
      return Entscheidungen.RECHTS;
    } else if(g == Gefahren.GEFAHR_RECHTS){
      return Entscheidungen.LINKS;
    } else if(g == Gefahren.GEFAHR_VORNE){
      return Entscheidungen.BREMSEN;
    } else {
      return null;
    }

  }


}
