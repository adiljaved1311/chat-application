package server;
import java.io.*;
import java.net.*;

public class ServerSide {
	public static void main(String[] args) {
		try {
		ServerSocket ss = new ServerSocket(8956);
		Socket s = ss.accept();
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		System.out.println("Connected");
		
		String m = din.readUTF();
		System.out.println("Client : "+m);
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		m = br.readLine();
		dout.writeUTF(m);
		
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}
