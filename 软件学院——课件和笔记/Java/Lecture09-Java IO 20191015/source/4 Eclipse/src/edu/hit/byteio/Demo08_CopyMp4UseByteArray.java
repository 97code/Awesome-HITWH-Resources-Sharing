package edu.hit.byteio;
import java.io.*;

/**
 * �������鿽���ķ�ʽ����mp4
 * �������鿽����һ�ζ�������Դ���е��ֽ�
 * ��һ��д�������ֽڣ��ٶ����Կ죬���Ҹ�Ч
 * �����ֶ�д�ļ���ʽ���ᳫ����Ϊ�����ڴ����
 * ���Է��ֱ������ڴ����
 * JVM����OS���ܵģ����������JVM���ڴ�Ͳ��Ǻܶ�
 */
public class Demo08_CopyMp4UseByteArray {
   public static void main(String[] args) throws IOException {
      FileInputStream fis = new FileInputStream("Am.mp4"); 
      FileOutputStream fos = new FileOutputStream("AmCopy.mp4");  
      byte[] arr = new byte[fis.available()]; 	  
      fis.read(arr); // ���ļ��ϵ��ֽڶ�ȡ���ڴ���
      fos.write(arr); // ���ֽ������е��ֽ�����д���ļ���
      fis.close();
      fos.close();
   }
}
