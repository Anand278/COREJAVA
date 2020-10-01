package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadUsingNio {

	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("d://javacore//dirfile//my.txt");
		FileChannel channel = f.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(8);
		while(channel.read(buffer)>0) {
			buffer.flip();
			for(int i=0;i<buffer.limit();i++) {
				System.out.print((char)buffer.get());
			}
			buffer.clear();
		}
		channel.close();
	}

}
