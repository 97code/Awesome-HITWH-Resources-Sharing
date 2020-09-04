package edu.hit.byteio;
import java.io.*;
/**
* A:����˼��
	* �ֽ���һ�ζ�дһ��������ٶ����Ա�һ�ζ�дһ���ֽڵ��ٶȿ�ܶ࣬
	* ���Ǽ��������������Ļ�����Ч����java��������Ƶ�ʱ��
	* Ҳ���ǵ������������˼�룬�����ṩ���ֽڻ�������
* B.BufferedInputStream
	* BufferedInputStream������һ��������(����)
	* ��BufferedInputStream�ж�ȡһ���ֽ�ʱ
	* BufferedInputStream��һ���Դ��ļ��ж�ȡ8192��, ���ڻ�������, ���ظ�����һ��
	* �����ٴζ�ȡʱ, �Ͳ������ļ���, ֱ�Ӵӻ������л�ȡ
	* ֱ�������������еĶ���ʹ�ù�, �����´��ļ��ж�ȡ8192��
* C.BufferedOutputStream
	* BufferedOutputStreamҲ������һ��������(����)
	* ����������д���ֽ�ʱ, ����ֱ��д���ļ�, ��д����������
	* ֱ��������д��, BufferedOutputStream�Ż�ѻ������е�����һ����д���ļ���
* D.����ͨ���ϵ���ʽ����ȡ�ı��ļ��鿴һ���Զ��뼰һ����д����
    * 
 */ 
public class Demo14_BufferCopy {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("1.mp3"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("1copy.mp3"));
		int b;
		while ((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close(); 
		bos.close();
		System.out.println("ok");
	}
}
