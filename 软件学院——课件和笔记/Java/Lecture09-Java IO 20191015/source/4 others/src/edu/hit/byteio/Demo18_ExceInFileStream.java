package edu.hit.byteio;

import java.io.*;

/**
 * IO���ؼ�����6�У�ÿ�ж����ܳ����쳣 IO����Ҫ�����ײ�ģ���˲���ʹ��try catch����Ϊʹ��try catchʵ�����ǰ��������ص���
 * û������ȥ��¶������ϣ���ѳ��ֵ������׳�ȥ�� ���������������main�������׳�IOException�ǲ������ε� ���������п��ܹز���
 * �����ڹ���֮ǰ�κ��쳣��ֱ���˳������������ɹ�
 */
public class Demo18_ExceInFileStream {
	public static void main(String[] args) {
		FileInputStream fis = new FileInputStream("h.txt"); // �ļ�������
		FileOutputStream fos = new FileOutputStream("i.txt"); // ·�����ܲ�����
		int b;
		while ((b = fis.read()) != -1) { // ���ɶ�
			fos.write(b); // ����д
		}
		fis.close(); // �ز���
		fos.close(); // �ز���
	}
}
