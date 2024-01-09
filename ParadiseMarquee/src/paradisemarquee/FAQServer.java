/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradisemarquee;

/**
 *
 * @author samee
 */
import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class FAQServer {
    private static Map<String, String> faqDatabase = new HashMap<>();

    public static void main(String[] args) {
        
        faqDatabase.put("1", "Fill in the information on the Bookings window then press confirm to book an event. Make sure to check the price. ");
        faqDatabase.put("2", "In Booking menu click Edit Bookings. Click on a booking from your history and press cancel.");
        faqDatabase.put("3", "In Booking menu click Edit Bookings. Press refresh.");
         faqDatabase.put("4", "Go to My account. Then press reset password");
           faqDatabase.put("5", "Meal includes Chicken Karahi, Biryani and carrot pudding");
           faqDatabase.put("6", "Slot 1 starts from 12pm to 5pm and slot 2 starts from 7pm to 12 pm");
           

        try {
            // Create a server socket and bind it to a port
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is listening on port 12345...");

            while (true) {
                // Accept incoming client connections
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

                // Create a new thread to handle the client's request
                Thread clientThread = new ClientThread(clientSocket);
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // A separate thread to handle each client's request
    private static class ClientThread extends Thread {
        private final Socket clientSocket;

        public ClientThread(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
            try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)
            ) {
                String question;
                while ((question = reader.readLine()) != null) {
                    String answer = faqDatabase.getOrDefault(question, "Sorry, I don't know the answer to that question.");
                    writer.println(answer);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    clientSocket.close();
                    System.out.println("Client disconnected: " + clientSocket.getInetAddress().getHostAddress());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
