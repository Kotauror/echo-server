package com.company;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class Messenger {

    private final PrintStream output;

    public Messenger(PrintStream output) {
        this.output = output;
    }

    public void informOfNewSocket() {
        output.println("A new socket has been connected");
    }

    public void informOfException(int portNumber, String exceptionMessage) {
        output.println("Exception caught when trying to listen on port: " + portNumber);
        output.println(exceptionMessage);
    }

    public void printServerPort(int portNumber) {
        output.println("Listening on port " + portNumber);
    }
}