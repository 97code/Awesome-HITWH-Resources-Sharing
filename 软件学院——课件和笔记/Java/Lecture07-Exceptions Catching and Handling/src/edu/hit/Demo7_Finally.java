package edu.hit;

public class Demo7_Finally {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("����Ϊ��");
			System.exit(0); // ����������˳�jvm�����			
		} finally {
			System.out.println("�����Ƿ����쳣��ִ��");
		}
	}
}
