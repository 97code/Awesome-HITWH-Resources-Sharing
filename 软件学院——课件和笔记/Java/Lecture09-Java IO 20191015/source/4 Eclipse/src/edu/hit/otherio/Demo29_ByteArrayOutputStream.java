package edu.hit.otherio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo29_ByteArrayOutputStream {

	/**
	 * @param args
	 * ByteArrayOutputStream
	 * �ڴ������
	 * 	 * 
	 * FileInputStream��ȡ���ĵ�ʱ�����������
	 * 
	 * ����������������������
	 * 1,�ַ�����ȡ
	 * 2,ByteArrayOutputStream
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		demo1();
//		demo2();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("s.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();	//���ڴ��д����˿����������ڴ�����
		
		int b;
		while((b = fis.read()) != -1) {
			baos.write(b);		//����ȡ�����������д���ڴ���
		}
		//��ʽһ�����Ե���ƽ̨���
		//byte[] arr = baos.toByteArray();	//��������������ȫ����ȡ����,����ֵ��arr����
		//System.out.println(new String(arr));
		
		// baos ���ڴ����飬���ùرգ�ʹ����֮�������jvm�ͷ�
		
		//��ʽ����ʹ��ƽ̨Ĭ�ϵ����ת����
		System.out.println(baos.toString());	//��������������ת��Ϊ���ַ���,���������п���ʡ�Ե���toString����
		fis.close();
	}

	// FileInputStream��ȡ���ĵ�ʱ�����������
	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("s.txt");
		byte[] arr = new byte[3];
		int len;
		while((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr,0,len));
		}		
		fis.close();
	}

}
