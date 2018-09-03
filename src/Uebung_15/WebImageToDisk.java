package Uebung_15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by maxr2011 on 09.02.2018.
 */
public class WebImageToDisk {
  public static void main(String[] args) throws IOException {
    InputStream is = null;
    FileOutputStream fos = null;
    HttpURLConnection connection = null;
    try {
      URL url = new URL("https://tinyurl.com/prog2image");
      connection = (HttpURLConnection) url.openConnection();
      is = connection.getInputStream();
      byte[] b = new byte[4096];
      fos = new FileOutputStream("pic.jpg");
      int n = 0;
      while (n != -1) {
        n = is.read(b);
        if (n != -1) fos.write(b, 0, n);
      }
    } finally {
      if (fos != null) {
        try { fos.close(); }
        catch (IOException e) { }
      }
      if (is != null) {
        try { is.close(); }
        catch (IOException e) { }
      }
      if (connection != null)
        connection.disconnect();
    }
  }
}
