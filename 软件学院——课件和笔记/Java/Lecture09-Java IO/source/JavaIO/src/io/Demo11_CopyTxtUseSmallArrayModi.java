package io;

import java.io.*;
/**
 * С���鿽���ı�
 * 
 * ע�⵽FileOutputStream��write��������Ҫ����ƫ����
 * write(byte[] b) û�����ñ���
 * write(byte[] b, int off, int len)д����Ч���ֽڸ���
 */
public class Demo11_CopyTxtUseSmallArrayModi {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		byte[] arr = new byte[2];
		int len;
		while ((len = fis.read(arr)) != -1) {
			fos.write(arr,0,len); 
		}
		fis.close();
		fos.close();
	}
}
