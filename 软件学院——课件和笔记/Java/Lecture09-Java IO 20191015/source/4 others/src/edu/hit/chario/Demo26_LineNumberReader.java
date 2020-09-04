package edu.hit.chario;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Demo26_LineNumberReader {
	/**
	 * LineNumberReader��BufferedReader������, ������ͬ�Ĺ���, ���ҿ���ͳ���к�
	 * ����getLineNumber()�������Ի�ȡ��ǰ�к�
	 * ����setLineNumber()�����������õ�ǰ�к�
	 */
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("m.txt"));
		String line;
		lnr.setLineNumber(100);
		while ((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":" + line);
		}
		lnr.close();
	}
}
