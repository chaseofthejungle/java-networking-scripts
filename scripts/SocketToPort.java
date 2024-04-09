import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.io.IOException;

public class SocketToPort {
   public static void main(String[] args) {
      try {
         InetAddress address = InetAddress.getByName("179.105.231.48");
         Socket socket = new Socket(address, 80);
         System.out.println("Established connection to " 
            + socket.getInetAddress()
            + " on port #" + socket.getPort() + " from port #"
            + socket.getLocalPort() + " of device IP " 
            + socket.getLocalAddress());
      } catch (UnknownHostException e) {
         System.err.println("Cannot find host: " + e  );
      } catch (SocketException e) {
         System.err.println("Cannot establish connection: " +e );
      } catch (IOException e) {
         System.err.println(e);
      }
   }
}
