package edu.hit.byteio;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 * @param args
 * @throws IOException 
 * FileOutputStream�ڴ��������ʱ�������û������ļ�����Ҵ�������
 * ���������ļ��ͻ��Ƚ��ļ���գ���д�룻����д�����ڹ����true
 * ��Ȼд������һ��int��, ���ǵ��ļ��ϵ���һ���ֽ�,���Զ�ȥ��ǰ����8λ
 */
public class Demo03_FileOutputStreamWriteByte {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("b.txt");
		fos.write(97); // �Զ�ȥ��ǰ����8λ
		fos.write(98); // д��ʱ�����ת���ɶ�Ӧ�ַ�
		fos.write(99);
		fos.write(100);
		fos.close();
	}
}
