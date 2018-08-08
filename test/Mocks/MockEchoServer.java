package Mocks;

import com.company.Server.EchoServer;
import com.company.Messenger;

import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Collections;

public class MockEchoServer extends EchoServer {

    private ArrayList runServerBooleans;

    public MockEchoServer(ServerSocket serverSocket, int portNumber, Messenger messenger) {
        super(serverSocket, portNumber, messenger);
        this.runServerBooleans = new ArrayList<Boolean>();
        fillBooleans(true, false);
    }
    
    private void fillBooleans(boolean runServer, boolean stopServer) {
        Collections.addAll(this.runServerBooleans, runServer);
        Collections.addAll(this.runServerBooleans, stopServer);
    }

    public boolean runServer() {
        Boolean firstBoolean = (Boolean) this.runServerBooleans.get(0);
        this.runServerBooleans.remove(0);
        return firstBoolean;
    }
}