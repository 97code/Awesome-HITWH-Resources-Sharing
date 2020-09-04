package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo25_Buffered {

	/**
	 * @param args
	 * �������������е����ⷽ��
     * BufferedReader��readLine()�������Զ�ȡһ���ַ�(���������з���)
     * BufferedWriter��newLine()�������һ����ƽ̨�Ļ��з���"\r\n"
	 */
	public static void main(String[] args) throws IOException {
		demo1();
		demo2();
	}

	public static void demo2() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("aaa.txt"));
		
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);   //��һ��
			bw.newLine();	//д���س����з�
			bw.write("\r\n");
		}		
		br.close();
		bw.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		String line;		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}		
		br.close();
	}
}
