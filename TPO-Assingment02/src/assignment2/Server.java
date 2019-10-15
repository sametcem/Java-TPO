package assignment2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class Server {
	
	private static CustomProtocol protocol = new CustomProtocol();
		
	public Server(){}

	public static void main(String[] args) throws Exception {
		Selector selector = Selector.open();
		ServerSocketChannel serverSocket = ServerSocketChannel.open();
		serverSocket.bind(new InetSocketAddress("localhost", 5221));
		serverSocket.configureBlocking(false);
		serverSocket.register(selector, SelectionKey.OP_ACCEPT);
		ByteBuffer buffer = ByteBuffer.allocate(256);

		while (true) {
			selector.select();
			Set<SelectionKey> selectedKeys = selector.selectedKeys();
			Iterator<SelectionKey> iter = selectedKeys.iterator();
			while (iter.hasNext()) {

				SelectionKey key = iter.next();

				if (key.isAcceptable()) {
					register(selector, serverSocket);
				}

				if (key.isReadable()) {
					try {
						answerWithEcho(buffer, key);
					}catch (IOException e) {
					}

				}
				iter.remove();
				buffer = ByteBuffer.allocate(256);
			}
		}
		
	}

	private static void answerWithEcho(ByteBuffer buffer, SelectionKey key) throws IOException {
		SocketChannel client = (SocketChannel) key.channel();
        client.read(buffer);
        System.out.println(new String(buffer.array()));
        String response = protocol.handleRequest(buffer, key);
        
        
        buffer.flip();
        client.write(ByteBuffer.wrap(response.getBytes()));
        buffer.clear();
	}

	private static void register(Selector selector, ServerSocketChannel serverSocket) throws IOException {

		SocketChannel client = serverSocket.accept();
		client.configureBlocking(false);
		client.register(selector, SelectionKey.OP_READ);
	}
}
