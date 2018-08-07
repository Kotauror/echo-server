import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.ServerSocket;

public class MockServerSocket extends ServerSocket {

    private final ByteArrayInputStream input;
    private final ByteArrayOutputStream output;

    public MockServerSocket(ByteArrayInputStream inputStream, ByteArrayOutputStream outputStream) throws IOException {
        this.input = inputStream;
        this.output = outputStream;
        }

        @Override
        public MockSocket accept() {
            // ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            // ByteArrayInputStream inputStream = new ByteArrayInputStream("hello".getBytes());
            return new MockSocket(this.output, this.input);
        }
}

