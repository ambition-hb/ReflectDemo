package com.haobi.InstanceDemo02;
import java.lang.reflect.Constructor;//���뷴���
/*
 * 2.�ڵ����вι���ʵ����
 */
class Person{
	private String name;
	private int age;
	public Person(String name, int age) {//ͨ������������������
		this.setName(name);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "����:"+this.name+",����:"+this.age;
	}
}

public class InstanceDemo02 {
	public static void main(String[] args) {
		Class<?> c = null;//ָ������
		try {
			c = Class.forName("com.haobi.InstanceDemo02.Person");//����Ҫʵ������������.������
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person per = null;//����Person����
		Constructor<?> cons[] = null;//����һ����ʾ���췽��������
		cons = c.getConstructors();//ͨ������ȡ��ȫ������
		try {
			//���췽���д��ݲ������˷���ʹ�ÿɱ�������գ���ʵ��������
			per = (Person)cons[0].newInstance("�Ʊ�",18);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(per);//�������������toString()
	}
}
