package edu.hit.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import edu.hit.bean.Person;

public class Demo31_ObjectInputStream {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 * ObjectInputStream
	 * ����������,�����л�
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//demo1();
		demo2();
	}

	public static void demo2() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("t.txt"));
		ArrayList<Person> list = (ArrayList<Person>) ois.readObject();		//�����϶���һ�ζ�ȡ		
		for (Person person : list) {
			System.out.println(person);
		}		
		ois.close();
	}

	public static void demo1() throws IOException, FileNotFoundException,
			ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("t.txt"));
		
		Person p1 = (Person) ois.readObject();
		Person p2 = (Person) ois.readObject();
		//Person p3 = (Person) ois.readObject();//���ļ���ȡ����ĩβʱ����EOFException
		
		System.out.println(p1);
		System.out.println(p2);		
		ois.close();
	}

}
