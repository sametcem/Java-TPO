package asn;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedFileRead {
	public static final int BUFFER_SIZE = 12;
	public static final int CONTINUE = 1;
	public static final int STOP = -1;
	public static final int SLEEP_TIME = 1000;
	
	public static void main(String args[]) throws IOException {
		RandomAccessFile _file = new RandomAccessFile("file.dat", "r");

		MappedByteBuffer _buf = _file.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, BUFFER_SIZE);
		_buf.rewind();

		while (true) {
				_buf.rewind();
				int mark = _buf.getInt();
				if (mark == STOP) {
					break;
				} else {
					int value1 = _buf.getInt();
					int value2 = _buf.getInt();
					System.out.println(value1 * value2);
				}
				sleep();
			} 
		}
	
	private static void sleep() {
		try {
			Thread.sleep(SLEEP_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
