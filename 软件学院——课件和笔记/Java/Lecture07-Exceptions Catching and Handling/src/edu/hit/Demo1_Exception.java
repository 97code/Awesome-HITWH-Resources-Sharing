package edu.hit;
public class Demo1_Exception {
	public static void main(String[] args) {
		// demo1();
		Demo d = new Demo();
		int x = d.div(10, 0);
		System.out.println(x);
	}
	public static void demo1() {
		int[] arr = { 11, 22, 33, 44, 55 };
		// arr = null; //NullPointerException ��ָ���쳣
		System.out.println(arr[10]); // ArrayIndexOutOfBoundsException ��������Խ���쳣
	}
}
class Demo {
	public int div(int a, int b) { // a = 10,b = 0
		return a / b; // 10 / 0 ��������10,������0��������0��ʱ��Υ�����������㷨��,�׳��쳣
						// new ArithmeticException("/ by zero");
	}
}
