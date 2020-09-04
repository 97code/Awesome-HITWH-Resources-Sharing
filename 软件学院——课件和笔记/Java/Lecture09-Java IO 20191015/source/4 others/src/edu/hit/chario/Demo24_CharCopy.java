package edu.hit.chario;

import java.io.*;


public class Demo24_CharCopy {

	public static void main(String[] args) throws IOException {
		// demo1();
		// demo2();
		// demo3();
		// demo4();
	}

	/*
	 * BufferedReader��read()������ȡ�ַ�ʱ��һ�ζ�ȡ�����ַ���������, Ȼ��������ظ�����, ���Ͷ�ȡ�ļ��Ĵ���, ���Ч��
	 * BufferedWriter��write()����д���ַ�ʱ����д��������, ������д��ʱ�Ż�д���ļ�, ����д�ļ��Ĵ���, ���Ч��
	 */
	public static void demo4() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("m.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("n.txt"));
		int c;
		while ((c = br.read()) != -1) {
			bw.write(c);
		}
		br.close();
		bw.close();
	}

	/*
	 * �����Կ����Ǵ��ı����ļ� ��Ϊ�ڶ���ʱ��Ὣ�ֽ�ת��Ϊ�ַ�,��ת��������,�����Ҳ�����Ӧ���ַ�,�ͻ���?����,д����ʱ��Ὣ�ַ�ת�����ֽ�д��ȥ,
	 * �����?,ֱ��д��,����д��֮����ļ�������,��������
	 */
	public static void demo3() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("m.txt");
		FileWriter fw = new FileWriter("n.txt");

		char[] arr = new char[1024];
		int len;
		while ((len = fr.read(arr)) != -1) { // ���ļ��ϵ����ݶ�ȡ���ַ�������
			fw.write(arr, 0, len); // ���ַ������е�����д���ļ���
		}

		fr.close();
		fw.close();
	}

	/*
	 * �����Կ����Ǵ��ı����ļ� ��Ϊ�ڶ���ʱ��Ὣ�ֽ�ת��Ϊ�ַ�,��ת��������,�����Ҳ�����Ӧ���ַ�,�ͻ���?����,д����ʱ��Ὣ�ַ�ת�����ֽ�д��ȥ,
	 * �����?,ֱ��д��,����д��֮����ļ�������,��������
	 */
	public static void demo2() throws FileNotFoundException, IOException {

		FileReader fr = new FileReader("1.jpg");
		FileWriter fw = new FileWriter("1copy.jpg");
		int c;
		while ((c = fr.read()) != -1) {
			fw.write(c);
		}
		fr.close();
		fw.close();
	}

	/*
	 * �ַ��ļ����� Writer������һ��2k��С������,���������,�ͻὫ����д���������� �����Ὣ����������ˢ��,�ٹر�
	 */
	public static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("m.txt");
		FileWriter fw = new FileWriter("n.txt");

		int c;
		while ((c = fr.read()) != -1) {
			fw.write(c);
		}

		fr.close();
		fw.close(); // Writer������һ��2k��С������,���������,�ͻὫ����д����������,�����Ὣ����������ˢ��,�ٹر�
	}
}
