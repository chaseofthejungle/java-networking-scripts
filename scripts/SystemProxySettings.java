import java.util.Iterator;
import java.util.List;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;

public class SystemProxySettings {
   public static void main(String[] args) {
      try {
         System.setProperty("java.net.useSystemProxies", "true");
         List<Proxy> l = ProxySelector.getDefault().select(
            new URI("http://www.example.com/"));
         
         for (Iterator<Proxy> iterate = l.iterator(); iterate.hasNext();) {
            Proxy newProxy = iterate.next();
            System.out.println("Proxy Hostname is: " + newProxy.type());
            InetSocketAddress socketAddr = (InetSocketAddress) newProxy.address();
            
            if (socketAddr == null) {
               System.out.println("No available proxy to report...");
            } else {
               System.out.println("Proxy System Hostname is: " + socketAddr.getHostName());
               System.out.println("Proxy System Port is: " + socketAddr.getPort());
            } 
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
