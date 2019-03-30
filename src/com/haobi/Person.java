package com.haobi;

interface China{//定义China接口
	public static final String NATIONAL = "China";//定义全局常量
	public static final String AUTHOR = "浩比";//定义全局常量
	public void sayChina();//定义无参的抽象方法
	public String sayHello(String name, int age);//定义有参的抽象方法
}

public class Person implements China{//定义Person类实现接口,必须实现接口的所有抽象方法
	private String name;
	private int age;
	public Person() {//声明无参构造
	}
	public Person(String name) {//声明有一个参数的构造方法
		this.name = name;
	}
	public Person(String name, int age) {//声明有两个参数的构造方法
		this(name);//调用有一个参数的构造方法
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
	public void sayChina() {//覆写方法，输出信息
		System.out.println("作者:"+AUTHOR+",国籍:"+NATIONAL);
	}
	public String sayHello(String name,int age) {//覆写方法，返回信息
		return name+",您好！我今年"+age+"岁了！";
	}
}