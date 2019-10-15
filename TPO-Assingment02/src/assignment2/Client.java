package assignment2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class Client {
	private static SocketChannel client;
	private static ByteBuffer buffer;
	private static CustomProtocol protocol;

	public Client() {
		try {
			protocol = new CustomProtocol();
			client = SocketChannel.open(new InetSocketAddress("localhost", 5221));
			buffer = ByteBuffer.allocate(256);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new Client();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter command:");
			String msg = scanner.nextLine();

					if(protocol.validateMessage(msg) == 1){
						System.out.println(sendMessage(msg));

					}else {
						System.out.println("WRONG REQUEST");
						continue;
					}
			}
	}
	

	public static String sendMessage(String msg) {
		buffer = ByteBuffer.wrap(msg.getBytes());
		String response = null;
		try {
			client.write(buffer);
			buffer.clear();
			buffer = ByteBuffer.allocate(256);
			client.read(buffer);
			response = new String(buffer.array());
			buffer.clear();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;

	}
}