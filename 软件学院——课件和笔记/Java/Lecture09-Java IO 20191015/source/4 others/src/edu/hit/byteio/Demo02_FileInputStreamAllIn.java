package edu.hit.byteio;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ����FileInputStream�е�read�������������ݲ���ӡ������̨ 
 * ��API read�Ķ��壺*
 */
public class Demo02_FileInputStreamAllIn {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt"); 
		int b;
		while ((b = fis.read()) != -1) {
			System.out.println(b);
		}
		fis.close();//�ر���Դ
	}
}
