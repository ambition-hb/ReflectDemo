package com.haobi;

interface China{//����China�ӿ�
	public static final String NATIONAL = "China";//����ȫ�ֳ���
	public static final String AUTHOR = "�Ʊ�";//����ȫ�ֳ���
	public void sayChina();//�����޲εĳ��󷽷�
	public String sayHello(String name, int age);//�����вεĳ��󷽷�
}

public class Person implements China{//����Person��ʵ�ֽӿ�,����ʵ�ֽӿڵ����г��󷽷�
	private String name;
	private int age;
	public Person() {//�����޲ι���
	}
	public Person(String name) {//������һ�������Ĺ��췽��
		this.name = name;
	}
	public Person(String name, int age) {//���������������Ĺ��췽��
		this(name);//������һ�������Ĺ��췽��
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
	public void sayChina() {//��д�����������Ϣ
		System.out.println("����:"+AUTHOR+",����:"+NATIONAL);
	}
	public String sayHello(String name,int age) {//��д������������Ϣ
		return name+",���ã��ҽ���"+age+"���ˣ�";
	}
}