package io;
import java.io.*;
/**
 * ��С���鿽������Ҫһ�ζ���̫������ݣ�һ��8*1024�ֽ�
 * һ���ڳ��������õĻ�������СΪ1024��ż������
 * ��������4K��8K��16K��4�ı���Ϊ������С����Ĵ�С��
*/
public class Demo13_CopyMp3UseSmallArray {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("001.mp3");
		FileOutputStream fos = new FileOutputStream("copy.mp3");
		byte[] arr = new byte[1024 * 8];
		int len;
		while((len = fis.read(arr)) != -1) {//������Ǽ�arr,���صľͲ��Ƕ�ȡ���ֽڸ���,�����ֽڵ����ֵ
			fos.write(arr,0,len);
		}		
		fis.close();
		fos.close();		
	}
}
