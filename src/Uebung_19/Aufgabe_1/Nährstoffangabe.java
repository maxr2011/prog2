package Uebung_19.Aufgabe_1;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Nährstoffangabe {

  double portionsgroesse;
  int anzahlPortionen;

  double Eiweiß;
  double Fett;
  double Kohlenhydrate;
  double Natrium;

  private Nährstoffangabe(double p, int a){
    this.portionsgroesse = p;
    this.anzahlPortionen = a;
  }

  private Nährstoffangabe(double p, int a, double E, double F, double K, double N){

    this.portionsgroesse = p;
    this.anzahlPortionen = a;

    this.Eiweiß = E;
    this.Fett = F;
    this.Kohlenhydrate = K;
    this.Natrium = N;

  }

  //getter

  public double getPortionsgroesse(){return portionsgroesse;}
  public int getAnzahlPortionen(){return anzahlPortionen;}
  public double getEiweiß(){return Eiweiß;}
  public double getFett(){return Fett;}
  public double getKohlenhydrate(){return Kohlenhydrate;}
  public double getNatrium(){return Natrium;}

  public static class NährstoffangabeBuilder {

    double portionsgroesse;
    int anzahlPortionen;

    double Eiweiß;
    double Fett;
    double Kohlenhydrate;
    double Natrium;

    public NährstoffangabeBuilder(double p, int a){

      this.portionsgroesse = p;
      this.anzahlPortionen = a;

    }

    public NährstoffangabeBuilder withEiweiß(double Eiweiß){
      this.Eiweiß = Eiweiß;
      return this;
    }

    public NährstoffangabeBuilder withFett(double Fett){
      this.Fett = Fett;
      return this;
    }

    public NährstoffangabeBuilder withKohlenhydrate(double Kohlenhydrate){
      this.Kohlenhydrate = Kohlenhydrate;
      return this;
    }

    public NährstoffangabeBuilder withNatrium(double Natrium){
      this.Natrium = Natrium;
      return this;
    }

    public Nährstoffangabe build(){

      return new Nährstoffangabe(portionsgroesse,anzahlPortionen,Eiweiß,Fett,Kohlenhydrate,Natrium);

    }

  }

}
