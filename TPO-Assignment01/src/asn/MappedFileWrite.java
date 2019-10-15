package asn;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Random;

public class MappedFileWrite {
	public static final int BUFFER_SIZE = 12;
	public static final int CONTINUE = 1;
	public static final int STOP = -1;
	public static final int ITERATION = 10;
	public static final int SLEEP_TIME = 1000;
	private static Random RANDOM = new Random();
	
	public static void main(String[] args) throws Exception {
		RandomAccessFile _file = new RandomAccessFile("file.dat", "rw");
		
		MappedByteBuffer _buf = _file.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, BUFFER_SIZE);
		
		int IterationLeft = ITERATION;
		
		while (IterationLeft > 0) {
			_buf.rewind();
			if (IterationLeft > 1) {
				int value1 = RANDOM.nextInt();
				int value2 = RANDOM.nextInt();
				_buf.putInt(CONTINUE);
				_buf.putInt(value1);
				_buf.putInt(value2);
			} else {
				_buf.putInt(STOP);
			}
			sleep();
			IterationLeft--;
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
