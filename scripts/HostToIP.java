import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostToIP {
   public static void main(String[] args) {
      InetAddress addr = null;
     
      try {
         addr = InetAddress.getByName("www.example.com");
      } catch (UnknownHostException e) {
         System.exit(2);
      }
     
      System.out.println(addr.getHostName() + " corresponds to an IPv4 of " + addr.getHostAddress());
      System.exit(0);
   }
}
