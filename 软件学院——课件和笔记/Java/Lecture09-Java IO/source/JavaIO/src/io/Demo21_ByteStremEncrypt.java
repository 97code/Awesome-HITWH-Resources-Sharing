package io;
import java.io.*;
public class Demo21_ByteStremEncrypt {
	/**
	 * @param args
	 * @throws IOException 
	 * ^���
	 * ��д�����ֽ������һ����,�����������Կ,���ܵ�ʱ���ٴ����Ϳ�����
	 */
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("�羰.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.jpg"));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b ^ 123);
		}
		
		bis.close();
		bos.close();
	}
}
