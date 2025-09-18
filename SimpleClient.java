import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        String hostname = "localhost";
        int port = 9090;
        
        try (Socket socket = new Socket(hostname, port)) {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            
            String message = "PREPARE:10"; 
            writer.println(message);
            
            System.out.println("Sent to server: " + message);
        }
    }
}