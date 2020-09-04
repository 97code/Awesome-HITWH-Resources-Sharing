package edu.hit.chario;

import java.io.*;

public class Demo27_TransIO {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		demo1();
//		demo2();
//      demo3();
	}

	public static void demo3() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8"));// ����Ч�Ķ�
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk"));// ����Ч��д
		int c;
		while ((c = br.read()) != -1) {
			bw.write(c);
		}

		br.close();
		bw.close();
	}

	//��InputStreamReaderת��������ת��
	public static void demo2() throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("utf-8.txt"), "uTf-8"); // ָ�������ַ�
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk"); // ָ�����д�ַ�

		int c;
		while ((c = isr.read()) != -1) {
			osw.write(c);
		}

		isr.close();
		osw.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		// ��Ĭ�ϱ�����д,��������
		FileReader fr = new FileReader("utf-8.txt");
		FileWriter fw = new FileWriter("gbk.txt");

		int c;
		while ((c = fr.read()) != -1) {
			fw.write(c);
		}

		fr.close();
		fw.close();
	}

}
