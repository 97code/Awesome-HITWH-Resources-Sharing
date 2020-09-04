package io;

import java.io.*;
/**
 * С���鿽���ı����˳�����ʾFileOutputStream��write()�������׳��ֵ�����
 * ���ֱ���������������� 
 * ����xxx.txtΪabc
 * ��һ�ζ���ֵΪ ab��ASCIIֵ����97,98
 * �ڶ��ζ���ֵӦ��Ϊc��ASCIIֵ���������99,98
 * ��˿�����yyy.txt��Ȼ��abcb������������abc  
 */

public class Demo10_CopyTxtUseSmallArray {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		byte[] arr = new byte[2];
		int len;
		while ((len = fis.read(arr)) != -1) {
			fos.write(arr);
		}
		fis.close();
		fos.close();
	}
}
