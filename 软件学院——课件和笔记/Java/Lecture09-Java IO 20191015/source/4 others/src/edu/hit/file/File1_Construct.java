package edu.hit.file;

import java.io.File;


public class File1_Construct {
	/**
	 * File(String pathname)������һ��·���õ�File����
	 * File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
	 * File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
	 */
	public static void main(String[] args) {
		demo1();
//		demo2();
//		demo3();
	}

	public static void demo3() {
		File parent = new File("d:\\source");
		String child = "001.mp3";
		File file = new File(parent, child);
		System.out.println(file.exists());
		System.out.println(parent.exists());
	}

	public static void demo2() {
		String parent = "d:\\source";
		String child = "001.mp3";
		File file = new File(parent,child);
		System.out.println(file.exists());
	}

	public static void demo1() {
		File file = new File("d:\\source\\001.mp3");
		System.out.println(file.exists());		
		File file2 = new File("abc.txt");
		System.out.println(file2.exists());		
		File file3 = new File("xxx.txt");
		System.out.println(file3.exists());
	}

}
