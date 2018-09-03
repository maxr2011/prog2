package Uebung_13.aufgabe_4;

/**
 * Created by maxr2011 on 12.01.2018.
 */
public class CyborgImpl extends AbstractWesen implements Cyborg {

  String vorname;
  String nachname;

  public void arbeiten(){
    //do something
  };

  public void Autofahren(){
    //do something
  };

  public void essen(){
    //do something
  };

  public void schlafen(){
    //do something
  };

  public void aufladen(){
    //do something
  };

  public void warten(){
    //do something
  };

  public Entscheidungen entscheide(Gefahren g){

      Mensch testMensch = new MenschImpl();
      Roboter testRoboter = new RoboterImpl();

      if(testMensch.entscheide(g) == testRoboter.entscheide(g)){
        return testMensch.entscheide(g);
      } else {

        double r = Math.random()*2;

        if(r > 1){
          return testMensch.entscheide(g);
        } else {
          return testRoboter.entscheide(g);
        }

      }

  };

}
