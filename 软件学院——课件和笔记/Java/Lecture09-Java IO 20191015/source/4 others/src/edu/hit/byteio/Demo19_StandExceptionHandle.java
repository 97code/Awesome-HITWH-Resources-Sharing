package edu.hit.byteio;

import java.io.*;

/**
 * IO���ؼ�����6�У�ÿ�ж����ܳ����쳣 IO����Ҫ�����ײ�ģ���˲���ʹ��try catch����Ϊʹ��try catchʵ�����ǰ��������ص���
 * û������ȥ��¶������ϣ���ѳ��ֵ������׳�ȥ�� ���������������main�������׳�IOException�ǲ������ε� ���������п��ܹز���
 * �����ڹ���֮ǰ�κ��쳣��ֱ���˳������������ɹ� ���ԣ��ѿ��ܳ����쳣�Ĵ�����try�жϣ�֮����finally����
 * ��дcatch��Ҳ���ǲ���catch��������
 */
public class Demo19_StandExceptionHandle {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("h.txt");
			fos = new FileOutputStream("i.txt");
			int b;
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
		} finally {
			try {
				if (fis != null) // fis�п���û�д����ɹ�
					fis.close(); // �п��ܹرղ���
			} finally { // try fianlly��Ƕ��Ŀ�����ܹ�һ��������һ��
				if (fos != null)
					fos.close();
			}
		}
	}
}
