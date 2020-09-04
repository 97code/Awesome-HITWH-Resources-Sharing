package edu.hit;

public class Demo8_Exception {
	public static void main(String[] args) {
		System.out.println(method());
	}

	public static int method() {
		int x = 10;
		try {
			x = 20;
			System.out.println(1 / 0);
			System.out.println("try");
			return x;
		} catch (Exception e) {
			x = 30;
			System.out.println("catch");
			return x;
		} finally {
			x = 40;
			System.out.println("finally");
			System.out.println(x);

			//ǧ��Ҫ��finally����д�������,��Ϊfinally��������Ϊ���ͷ���Դ,�ǿ϶���ִ�е�
			//�����������д�������,��ôtry��catch�Ľ�����ᱻ�ı�,������ôд���Ƿ���
		}
	}

}