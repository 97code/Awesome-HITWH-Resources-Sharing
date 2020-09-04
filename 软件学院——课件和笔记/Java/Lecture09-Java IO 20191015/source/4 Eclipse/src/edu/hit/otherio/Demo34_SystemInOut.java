package edu.hit.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Demo34_SystemInOut {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//		demo1();
		demo2();
		
	}

	public static void demo2() throws FileNotFoundException, IOException {
		System.setIn(new FileInputStream("m.txt"));			//�ı��׼������
		System.setOut(new PrintStream("w.txt"));			//�ı��ע�����
		
		InputStream is = System.in;							//��ȡ��׼�ļ���������,Ĭ��ָ�����,�ı��ָ���ļ�
		PrintStream ps = System.out;						//��ȡ��׼�����,Ĭ��ָ����ǿ���̨,�ı���ָ���ļ�
		
		int b;
		while((b = is.read()) != -1) {
			ps.write(b);
		}
		//System.out.println();								//Ҳ��һ�������,���ù�,��Ϊû�к�Ӳ���ϵ��ļ����������Ĺܵ�
		is.close();
		ps.close();
	}

	public static void demo1() throws IOException {
		InputStream is = System.in;
		int x = is.read(); //�Ӽ���ֻ����һ���ֽڣ�����ȡ��һ���ַ��������ʹ��scanner��װһ��
		System.out.println(x);		
		//is.close();		//�ж��Ƿ���Ҫclose������رգ���������û�а취ִ�У����Ǻ��ļ������˱���ر�
		
		InputStream is2 = System.in;
		int y = is2.read();
		System.out.println(y); //���־��ܲ�ͬ��inputstream�����󣬵���Ҳ�ᱨ��˵��System.in��Ψһ��
		
	}

}
