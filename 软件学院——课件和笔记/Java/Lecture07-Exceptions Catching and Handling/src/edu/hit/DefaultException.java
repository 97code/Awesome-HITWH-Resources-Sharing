package edu.hit;

class MyException extends Exception { // �Զ����쳣��
	public MyException(String msg) {
		super(msg); // ���ó����й��췽�������ݴ�����Ϣ
	}
}

public class DefaultException {
	public static void main(String args[]) {
		try {
			throw new MyException("�Զ����쳣��");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
