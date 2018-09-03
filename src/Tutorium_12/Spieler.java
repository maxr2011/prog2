package Tutorium_12;

/**
 * Created by maxr2011 on 13.02.2018.
 */
public class Spieler {

  String Name;
  int rank;

  public Spieler(String n, int r){
    this.Name = n;
    if((r > 0) && (r < 11)){
      this.rank = r;
    } else {
      this.rank = 1;
    }
  }

}
