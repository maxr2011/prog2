package Tutorium_10;

/**
 * Created by maxr2011 on 13.02.2018.
 */
public class FahrradDoppler {

  Fahrrad f;

  public FahrradDoppler(Fahrrad fa){
    this.f = fa;
  }

  public void fahren(){
    for(int i = 0; i < 2; i++) {
      new Thread(() -> {
        f.fahren();
      }).start();
    }
  }

}
