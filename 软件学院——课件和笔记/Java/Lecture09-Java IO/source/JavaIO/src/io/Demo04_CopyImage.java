package io;

import java.io.*;
/** 
 *  ���ֽڿ���ͼƬ
 *  ��Ҫע��ر��������������
 *  �����Ҫ׼ȷ����ʱ�䣬����ʹ���������
 *  ����֮ǰ���ϣ�
 *  long startTime = System.currentTimeMillis();
 *  ����֮����ϣ�
 *  long endTime = System.currentTimeMillis();
 *  float seconds = (endTime - startTime) / 1000F;
 *  System.out.println(Float.toString(seconds) + " seconds.");
 */
public class Demo04_CopyImage {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("�羰.jpg"); 
		FileOutputStream fos = new FileOutputStream("copy.jpg"); 
		int b;
		while ((b = fis.read()) != -1) { // �ڲ��ϵĶ�ȡÿһ���ֽ�
			fos.write(b); // ��ÿһ���ֽ�д��
		}
		fis.close(); // �����ͷ���Դ
		fos.close();		
	}
}
