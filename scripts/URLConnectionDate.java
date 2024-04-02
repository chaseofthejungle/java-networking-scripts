import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class URLConnectionDate {
    public static void main(String args[]) throws Exception {
        URL url = new URL("http://www.example.com");
        HttpURLConnection httpConnect = (HttpURLConnection) url.openConnection();
        long dateOfConnect = httpConnect.getDate();
        if (dateOfConnect == 0)
            System.out.println("No date provided for this connection.");
        else
            System.out.println("Date of Connection: " + new Date(dateOfConnect));
    }
}
