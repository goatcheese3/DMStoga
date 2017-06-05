package chat;

import java.io.*;
import java.net.*;

/**
 * Created by Justin Huang on 6/4/2017.
 */
public class DMServer{

    private ObjectInputStream in;
    private ObjectOutputStream out;
    private ServerSocket server;
    private Socket socket;

    /**
     * Sets up the server
     */
    public void run() {
        try {
            server = new ServerSocket(6789, 10);
            while(true) {
                try {
                    queue();
                    streams();
                    chats();
                } catch (EOFException eof) {
                    showMessage("");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Queues connection and displays socket information
     */
    public void queue() {
        showMessage("Waiting for connection...\n");

        try {
            socket = server.accept();
        } catch (Exception e) {
            e.printStackTrace();
        }

        showMessage("Connected to " + socket.getInetAddress().getHostName());

    }

    public void streams() throws EOFException{

    }
    public void chats(){

    }

    public String showMessage(String s) {
        return s;
    }//wtf is the point of this lol
}
