package io;

import java.io.*;
/**
 * С���鿽����׼д�� 
 * һ���ڳ��������õĻ�������СΪ1024��ż����
 * ��������4K��8K��16K��4�ı���Ϊ������С����Ĵ�С
 * ע��fis.read(arr)�������©��arr��ʵ���϶���fis����ʱ��û�д�С�����
 * 
 */
public class Demo12_CopyUseSmallArrayStand {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("yyy.txt");
		byte[] arr = new byte[1024 * 8];
		int len;
		while ((len = fis.read(arr)) != -1) { //������Ǽ�arr,���صľͲ��Ƕ�ȡ���ֽڸ���,�����ֽڵ����ֵ
			fos.write(arr, 0, len); // ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����ļ��������
		}
		fis.close();
		fos.close();
	}
}
