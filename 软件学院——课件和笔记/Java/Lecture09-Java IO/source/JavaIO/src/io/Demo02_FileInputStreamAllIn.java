package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ����FileInputStream�������������ݲ���ӡ������̨ *
 */
public class Demo02_FileInputStreamAllIn {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("xxx.txt"); 
		int b;
		while ((b = fis.read()) != -1) {
			System.out.println(b);
		}
		fis.close();//�ر���Դ
	}
}
