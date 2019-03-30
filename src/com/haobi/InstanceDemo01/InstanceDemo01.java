package com.haobi.InstanceDemo01;
/*
 * 2.�ٵ����޲ι���ʵ����
 */
class Person{
	private String name;
	private int age;
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

public class InstanceDemo01 {
	public static void main(String[] args) {
		Class<?> c = null;//ָ������
		try {
			c = Class.forName("com.haobi.InstanceDemo01.Person");//����Ҫʵ������������.������
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person per = null;//����Person����
		try {
			//ʵ����Person����
			per = (Person)c.newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		per.setName("�Ʊ�");
		per.setAge(18);
		System.out.println(per);//�������������toString()
	}
}
