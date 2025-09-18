import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        int port = 9090;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);
            
            try (Socket socket = serverSocket.accept()) {
                System.out.println("New client connected");
                
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                
                String receivedMessage = reader.readLine();
                System.out.println("Received from client: " + receivedMessage);
            }
        }
    }
}