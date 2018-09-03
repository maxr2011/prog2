package Test123;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by maxr2011 on 12.02.2018.
 */
public class copytest {

  static void copy(String a, String b) throws IOException, FileNotFoundException {

    try{
      InputStream IS = new FileInputStream(a);
      OutputStream OS = new FileOutputStream(b);
      int c;
      do{
        c = IS.read();
        if(c != -1)
          OS.write(c);
      } while(c != -1);
      IS.close();
      OS.close();
    } catch (FileNotFoundException e){
      System.out.println("Datei wurde nicht gefunden!");
    } catch (IOException io){
      io.printStackTrace();
    }

  }

  public static void main(String[] args) throws  IOException{

    copy("testcopy.dat", "t2copy.dat");

  }

}
