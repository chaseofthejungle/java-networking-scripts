import java.net.URL;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class WebPageDownloader {
   public static void main(String[] args) throws Exception {
      URL url = new URL("http://www.example.com");
      BufferedReader pageReader = new BufferedReader(new InputStreamReader(url.openStream()));
      BufferedWriter pageWriter = new BufferedWriter(new FileWriter("exampledata.html"));
      String lineFromPage;
      
      while ((lineFromPage = pageReader.readLine()) != null) {
         System.out.println(lineFromPage);
         pageWriter.write(lineFromPage);
         pageWriter.newLine();
      }
      pageReader.close();
      pageWriter.close();
   }
}
