package edu.hit.byteio;

import java.io.*;
/** 
 *  ���ֽڿ���mp3���Ա�Demo04��mp3��ͼƬ��һЩ����ȡ�ٶȺܳ�
 *  ��Ҫע��ر��������������
 *  �����Ҫ׼ȷ����ʱ�䣬����ʹ���������
 *  ����֮ǰ���ϣ�
 *  long startTime = System.currentTimeMillis();
 *  ����֮����ϣ�
 *  long endTime = System.currentTimeMillis();
 *  float seconds = (endTime - startTime) / 1000F;
 *  System.out.println(Float.toString(seconds) + " seconds.");
 */
public class Demo05_CopyMp3 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("1.mp3"); 
		FileOutputStream fos = new FileOutputStream("1copy.mp3"); 
		int b;
		while ((b = fis.read()) != -1) { // �ڲ��ϵĶ�ȡÿһ���ֽ�
			fos.write(b); // ��ÿһ���ֽ�д��
		}
		fis.close(); // �����ͷ���Դ
		fos.close();
		System.out.println("ok"); //�ص�ppt P29����
	}
}
