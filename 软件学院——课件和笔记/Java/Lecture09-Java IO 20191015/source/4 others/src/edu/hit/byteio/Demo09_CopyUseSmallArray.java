package edu.hit.byteio;
import java.io.*;
/**
 * ��ʾС���鿽�����׳��ֵ�����
 * write(byte[] b)
 * write(byte[] b, int off, int len)д����Ч���ֽڸ���
 * ����xxx.txtΪabc
 * ��һ�ζ���ֵΪ ab��ASCIIֵ����97,98
 * �ڶ��ζ���ֵӦ��Ϊc��ASCIIֵ���������99,98
 * ԭ������byte[]����ĵڶ���ֵ��û�б����ǵ���ֻ��һ��c���������һ����ֵ
 * ԭ����һ�ζ���b�����������ĩβ
 * ��ˣ����ļ�copy�����У����ֱ��ʹ��write()�������������
 */
public class Demo09_CopyUseSmallArray {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c.txt");//abc
		byte[] arr = new byte[2];
		int a = fis.read(arr);	//���ļ��ϵ��ֽڶ�ȡ���ֽ�������		
		System.out.println(a);	//��������Ч�ֽڸ���
		for (byte b : arr) {	//��һ�λ�ȡ���ļ��ϵ�a��b
			System.out.println(b);
		}		
		System.out.println("-----------------------");		
		int c = fis.read(arr);
		System.out.println(c);
		for (byte b : arr) {
			System.out.println(b); //��ʱ�����������
		}
		fis.close(); 
	}
}
