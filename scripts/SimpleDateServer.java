import java.util.Date;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.PrintWriter;

// Not intended for production environments: server can only handle 1 client at a time.
public class SimpleDateServer {
    public static void main(String[] args) throws IOException {
        try (var listener = new ServerSocket(54375)) {
            System.out.println("The Date Server is now connected.");
            while (true) {
                try (var socket = listener.accept()) {
                    var dateOutput = new PrintWriter(socket.getOutputStream(), true);
                    dateOutput.println(new Date().toString());
                }
            }
        }
    }
}
