package io;

import java.io.*;
/**
 * �ֽ���д�����ĵ�����
	   * �ֽ���ֱ�Ӳ������ֽ�,����д�����ı��뽫�ַ���ת�����ֽ����� 
	   * д���س����� write("\r\n".getBytes()); 
	   * ���Է����ֽ����������ıȽ��鷳
 */
public class Demo17_ByteStreamWriteChinese {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("zzz.txt");
		fos.write("��������ҵ��ѧ".getBytes());// to byte[]
		fos.write("\r\n".getBytes());//ת���ַ�Ҳ��˴���
		fos.close();
	}
}
