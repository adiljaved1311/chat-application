package client;
import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost",8956);
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			System.out.println("Connected");
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			String m=br.readLine();
			dout.writeUTF(m);
			m = din.readUTF();
			System.out.println("Server : "+m);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
