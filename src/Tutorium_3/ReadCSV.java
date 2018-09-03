package Tutorium_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Created by maxr2011 on 11.02.2018.
 */
public class ReadCSV {

  String path;
  Person[] pers;
  ArrayList<Person> AL = new ArrayList<>();

  public ReadCSV(String p){
    this.path = p;

    try
    {
      FileReader FR = new FileReader(path);
      BufferedReader BR = new BufferedReader(FR);
      String TEXT = "";

      int i = 0;

      while((TEXT=BR.readLine()) != null){
        Person pp = new Person();
        String[] spl = TEXT.split(";");
        pp.name = spl[0];
        pp.nachname = spl[1];
        pp.alter = Integer.valueOf(spl[2]);
        AL.add(pp);
      }

      this.pers = new Person[AL.size()];
      int k = 0;

      for(Person ppp : AL){
        pers[k] = ppp;
        k++;
      }


    } catch (FileNotFoundException e) {

    } catch (IOException u){

    }

  }

  Person[] returnPerson(){
    return pers;
  }

}
