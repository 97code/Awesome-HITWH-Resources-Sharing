package edu.hit;

public class ExpDemo09 {
	public static void main(String args[]) {
		try {
			throw new Exception("�׳��쳣��");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
