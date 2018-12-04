package de.tub.ise.ec;

import de.tub.ise.hermes.Receiver;
import de.tub.ise.hermes.RequestHandlerRegistry;

import java.io.IOException;

public class Server { // Receiver

    static int port = 8888;

    public static void main(String[] args) {
        RequestHandlerRegistry reg = RequestHandlerRegistry.getInstance();
        reg.registerHandler("serverHandlerID", new ServerHandler());
            try {
            Receiver receiver = new Receiver(port);
            receiver.start();
            System.out.println("Server has started ...");
        } catch (IOException e) {
            System.out.println("Connection error: " + e);
        }
    }
}
