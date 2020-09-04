package edu.hit.byteio;

import java.io.*;

/**
 * jdk1.7�Ժ�ı�׼�쳣д�� AutoCloseable
 * FileInputStream��FileOutputStreamʵ����AutoCloseable
 */
public class Demo20_StandExceptionHandleNew {
	public static void main(String[] args) throws IOException {
		try (FileInputStream fis = new FileInputStream("1.mp3");
				FileOutputStream fos = new FileOutputStream("1copy.mp3");) {
			int b;
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
		}
	}
}

class MyClose implements AutoCloseable {
	public void close() {
		System.out.println("�ҹ���");
	}
}