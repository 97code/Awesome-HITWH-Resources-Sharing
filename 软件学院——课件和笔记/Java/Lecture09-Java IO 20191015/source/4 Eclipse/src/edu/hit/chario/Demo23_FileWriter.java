//package edu.hit.chario;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriterд FileWriter���write()���������Զ����ַ�תΪ�ֽ�д�� *
 */
public class Demo23_FileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("k.txt");
		fw.write("��Һ�!");
		fw.write("\r\n");
		fw.write(97);		
		fw.close();
	}
}
