package edu.hit.byteio;

import java.io.*;

/**
 * chinese������GBK��ÿ���ַ��������ֽڣ���read()����ÿ��ֻ�ܶ�һ���ֽ� ���Բ���������ʽ����������󣬽���������ת�����ġ� ��api�ĵ�
 * String(byte[] bytes) ���죺 ���ܣ�ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte ���飬����һ���µ� String��
 * ��˿�����String(byte[] bytes)ת���ġ�
 * 
 * �ֽ�����ȡ���ĵ�����: �ֽ����ڶ����ĵ�ʱ���п��ܻ�����������,������� �ֽ���д�����ĵ�����
 * �ֽ���ֱ�Ӳ������ֽ�,����д�����ı��뽫�ַ���ת�����ֽ����� д���س����� write("\r\n".getBytes());
 */

public class Demo16_ByteStreamReadChinese {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("chinese.txt");
		// byte[] arr = new byte[3];//���ְ��
		byte[] arr = new byte[4]; // Ҳ���ܱ�֤��������г��ֶ��ŵ�Ҳ�������
		int len;
		while ((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr, 0, len));
		}
		fis.close();
	}
}
