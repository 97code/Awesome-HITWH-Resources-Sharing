package io;

import java.io.*;
/** 
 *  ���ֽڿ���mp4���Ա�Demo05�������Ӱ���ô��ַ�ʽ����Ч�ʼ��͡�
 *  ��Ҫע��ر��������������
 *  �����Ҫ׼ȷ����ʱ�䣬����ʹ���������
 *  ����֮ǰ���ϣ�
 *  long startTime = System.currentTimeMillis();
 *  ����֮����ϣ�
 *  long endTime = System.currentTimeMillis();
 *  float seconds = (endTime - startTime) / 1000F;
 *  System.out.println(Float.toString(seconds) + " seconds.");
 */
public class Demo06_CopyMp4 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("American.mp4"); 
		FileOutputStream fos = new FileOutputStream("copy.mp4"); 
		int b;
		while ((b = fis.read()) != -1) { // �ڲ��ϵĶ�ȡÿһ���ֽ�
			fos.write(b); // ��ÿһ���ֽ�д��
		}
		fis.close(); // �����ͷ���Դ
		fos.close();
	}
}
