package com.company.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class IOHandler {

    private PrintWriter output;
    private BufferedReader input;

    public IOHandler(Socket clientSocket) throws IOException {
        this.output = new PrintWriter(clientSocket.getOutputStream(), true);
        this.input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public void printToSocket(String inputLine) {
        this.output.println(inputLine);
    }

    public String readFromSocket() throws IOException {
        return this.input.readLine();
    }
}
