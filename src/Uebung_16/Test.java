package Uebung_16;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Test {

  public static void main(String[] args)
      throws IOException
  {
    PrintStream out = System.out;
    InputStream in = System.in;
    int i;
    do {
      i = in.read();
      if (i != -1) out.write(i);
    }
    while (i != -1);
  }

}
