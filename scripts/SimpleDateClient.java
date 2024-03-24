import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

// Program should be run at command line.
public class SimpleDateClient {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Please include Server IP Address as a command argument.");
            return;
        }
      
        var socket = new Socket(args[0], 54375);
        var dateInput = new Scanner(socket.getInputStream());
        System.out.println("Server Date/Time: " + dateInput.nextLine());
    }
}
