
import java.io.*;
import java.net.*;

public class Sender{

    private Socket socket = null;
    private int port;
    private String host;
    private String fileName;
    private int count;

    public Sender(int port, String host){
      this.port = port;
      this.host = host;
    }

    public static void main(String[] args){

        DataOutputStream output = null;
        DataInputStream input = null;

        Socket socket = new Socket(host, port);
        //https://stackoverflow.com/questions/9520911/java-sending-and-receiving-file-byte-over-sockets
        long length = file.length();
        byte[] bytes = new byte[16 * 1024];

        File file = new File(fileName);

        output = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        input = new DataInputStream(new BufferedInputStream(socket.getInputStream(file)));

        while ((count = in.read(bytes)) > 0) {
              out.write(bytes, 0, count);
        }
        out.close();
        in.close();
        socket.close();

        System.out.println("Connection send");
    }
}
