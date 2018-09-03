package Uebung_15.OutputStream;

import java.io.IOException;

/**
 * Created by maxr2011 on 09.02.2018.
 */
public class OutputStream {

  // Bedingungen: In byte[] keine größeren Datentypen
  //              off <= len
  //              b[off] first byte
  //              b[off+len-1] last byte
  //              b[] darf nicht null sein sonst NullPointerException
  //              off und len darf nicht negative sein sonst IndexOutOfBoundsException
  //              off+len darf nicht größer als b.length sein sonst IndexOutOfBoundsException
  //              bei einem I/O Error wird die IOException geworfen


  public void write(byte b[], int off, int len) throws IOException, NullPointerException, IndexOutOfBoundsException{

  }

}
