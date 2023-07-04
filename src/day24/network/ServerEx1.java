package day24.network;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx1 {
	public static void main(String[] args) {
		ServerSocket serverSocket = new ServerSocket();
		int port = 5001;
		serverSocket = new SeverSocket(port);
		while(true) {
			System.out.println("waiting");
			
			Socket socket = serverSocket.accept();
			System.out.println("connect");
			
			InputStream is = socket.getInputStream();
			byte [] bytes = new byte[1024];
			int readCount = is.read();
			String str = new String(bytes);
			System.out.println("data : " + str );
		}
		
	}

}
