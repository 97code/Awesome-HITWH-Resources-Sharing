package edu.hit.byteio;

import java.io.*;

public class Demo21_ByteStremEncrypt {
	/**
	 * ^��� ��д�����ֽ������һ����,�����������Կ,���ܵ�ʱ���ٴ����Ϳ�����
	 */
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("1.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("1copy.jpg"));

		int b;
		while ((b = bis.read()) != -1) {
			bos.write(b ^ 123);
		}

		bis.close();
		bos.close();
	}
}
