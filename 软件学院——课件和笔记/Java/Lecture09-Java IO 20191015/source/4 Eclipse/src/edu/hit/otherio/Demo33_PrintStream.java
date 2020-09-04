package edu.hit.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import edu.hit.bean.Person;

public class Demo33_PrintStream {

	/**
	 * @param args
	 * @throws IOException 
	 * PrintStream��PrintWriter�ֱ��Ǵ�ӡ���ֽ������ַ���
	 * ֻ����������
	 */
	public static void main(String[] args) throws IOException {
		demo1();
		//demo2();
	}

	public static void demo2() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new FileOutputStream("v.txt"),true);
		//pw.println(97);//�Զ�ˢ������ֻ��Ե���println����
		//pw.write(97); //�����õ�a��������˹�������д�����ģ���2K����
		pw.print(97); // ���˹���Ҳ�����Զ�ˢ��
		pw.println(97); //�Զ�ˢ��
		pw.close(); 
	}

	public static void demo1() {
		System.out.println("aaa");
		
		
		PrintStream ps = System.out;			//���Ի�һ�ַ�ʽд����ȡ��ע�����
		ps.println(97);							//�ײ�ͨ��Integer.toString()��97ת�����ַ�������ӡ
		ps.write(97);							//�������,�ҵ���Ӧ��a����ӡ		
		Person p1 = new Person("����", 23);
		ps.println(p1);							//Ĭ�ϵ���p1��toString����		
		Person p2 = null;						//��ӡ������������,�����null,�ʹ�ӡnull,�������null�ʹ�ӡ�����toString����
		ps.println(p2);
		ps.close();
	}

}
