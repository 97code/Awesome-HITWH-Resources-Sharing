package edu.hit;
import java.io.FileInputStream;
public class Demo2_Exception {
	public static void main(String[] args) {
		// ����ʱ�쳣��
		int[] arr = { 11, 22, 33, 44, 55 };
		System.out.println(arr[10]); // ArrayIndexOutOfBoundsException ��������Խ���쳣
		// ����ʱ�쳣
		FileInputStream fis = new FileInputStream("xxx.txt");
	}
}
