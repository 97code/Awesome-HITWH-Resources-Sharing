package io;

import java.io.*;

/**
 * �������鿽���ķ�ʽ����mp3
 * �������鿽����һ�ζ�������Դ���е��ֽ�
 * ��һ��д�������ֽڣ��ٶ����Կ죬���Ҹ�Ч
 * �����ֶ�д�ļ���ʽ���ᳫ����Ϊ�����ڴ����
 */
public class Demo07_CopyMp3UseByteArray {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("001.mp3"); 
		FileOutputStream fos = new FileOutputStream("copy.mp3"); 
		// int len = fis.available();
		// System.out.println(len);
		byte[] arr = new byte[fis.available()]; // �������ļ�һ����С���ֽ�����
		fis.read(arr); // ���ļ��ϵ��ֽڶ�ȡ���ڴ���
		fos.write(arr); // ���ֽ������е��ֽ�����д���ļ���
		fis.close();
		fos.close();
		System.out.println("over");
	}
}
