package edu.hit.byteio;

import java.io.*;
/** 
 *  ����������ļ���������ͨ�������ʾ������ֱ�ӿ����ֽ��ļ��������ַ��ļ�
 *  ��Ҫע��ر��������������
 *  �����Ҫ׼ȷ����ʱ�䣬����ʹ���������
 *  ����֮ǰ���ϣ�
 *  long startTime = System.currentTimeMillis();
 *  ����֮����ϣ�
 *  long endTime = System.currentTimeMillis();
 *  float seconds = (endTime - startTime) / 1000F;
 *  System.out.println(Float.toString(seconds) + " seconds.");
 */
public class Demo06_CopyChineseCharacter {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c1.txt"); 
		FileOutputStream fos = new FileOutputStream("c1copy.txt"); 
		int b;
		while ((b = fis.read()) != -1) { // �ڲ��ϵĶ�ȡÿһ���ֽ�
			fos.write(b); // ��ÿһ���ֽ�д��
		}
		fis.close(); // �����ͷ���Դ
		fos.close();
		System.out.println("ok"); //ppt����
	}
}
