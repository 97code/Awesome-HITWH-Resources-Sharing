package edu.hit.file;

import java.io.File;
import java.io.IOException;

public class File2_CreteFileAndDir {

	/**
	 * * A:��������
			* public boolean createNewFile():�����ļ� ��������������ļ����Ͳ�������
			* public boolean mkdir():�����ļ��� ��������������ļ��У��Ͳ�������
			* public boolean mkdirs():�����ļ���,������ļ��в����ڣ�����㴴������
		* B:������ʾ
			* File��Ĵ�������
		
			* ע�����
				* ����㴴���ļ������ļ�������д�̷�·������ô��Ĭ������Ŀ·���¡�
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//		demo1();
		demo2();
	}

	public static void demo2() {
		File dir1 = new File("aaa");
		System.out.println(dir1.mkdir());
		
		File dir2 = new File("bbb.txt"); //�ļ���Ҳ�ǿ����к�׺��
		System.out.println(dir2.mkdir());
		
		File dir3 = new File("ccc\\ddd");
		System.out.println(dir3.mkdirs()); 	//�����༶Ŀ¼
	}

	public static void demo1() throws IOException {
		File file = new File("yyy.txt");
		System.out.println(file.createNewFile()); //���û�оʹ���,����true
		
		File file2 = new File("zzz");
		System.out.println(file2.createNewFile());
	}

}
