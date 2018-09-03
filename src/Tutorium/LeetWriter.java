package Tutorium;

/**
 * Created by maxr2011 on 11.02.2018.
 */
import java.io.IOException;
import java.io.Writer;

public class LeetWriter extends Writer {

  private Writer writer;

  public LeetWriter(Writer writer) {
    this.writer = writer;
  }
  @Override
  public void write(char[] cbuf, int off, int len) throws IOException {
    writer.write(cbuf, off, len);
  }
  @Override
  public void flush() throws IOException {
    writer.flush();
  }
  @Override
  public void close() throws IOException {
    writer.close();
  }
  @Override
  public void write(String str) throws IOException {
    writer.write(translate(str));
  }
  private String translate(String str){
    char[] leetSatz = str.toCharArray();
    for (int i = 0; i < leetSatz.length; i++) {
      leetSatz[i] = Character.toLowerCase((leetSatz[i]));
      switch (leetSatz[i]) {
        case 'a':
          leetSatz[i] = '4';
          break;
        case 'e':
          leetSatz[i] = '3';
          break;
        case 'g':
          leetSatz[i] = '6';
          break;
        case 'i':
          leetSatz[i] = '1';
          break;
        case 'o':
          leetSatz[i] = '0';
          break;
        case 's':
          leetSatz[i] = '5';
          break;
        case 't':
          leetSatz[i] = '7';
          break;
      }
    }
    return new String(leetSatz);
  }
}
