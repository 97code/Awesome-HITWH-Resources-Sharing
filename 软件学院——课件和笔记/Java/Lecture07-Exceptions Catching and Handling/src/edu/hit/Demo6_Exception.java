package edu.hit;


public class Demo6_Exception {

	/**
	 * * A:������ʾ
	 * try...catch�ķ�ʽ�������쳣
	 * 
	 * try������������catch,��ôС���쳣��ǰ��,����쳣�ź���,���ݶ�̬��ԭ��,�����ķ�ǰ��,�ͻὫ���е�����������
	 * �����catch��û��������
	 */
	public static void main(String[] args) {
		//demo1();
		int a = 10;
		int b = 0;
		int[] arr = {11,22,33,44,55};
		
		//JDK7��δ������쳣
		try {
			System.out.println(a / b);
			System.out.println(arr[10]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("������");
		} 
	}

	public static void demo1() {
		int a = 10;
		int b = 0;
		int[] arr = {11,22,33,44,55};
		
		try {
			System.out.println(a / b);
			System.out.println(arr[10]);
			arr = null;
			System.out.println(arr[0]);
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ��");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ����");
		} catch (Exception e) {				//Exception e = new NullPointerException();
			System.out.println("������");
		}
		
		System.out.println("over");
	}

}
