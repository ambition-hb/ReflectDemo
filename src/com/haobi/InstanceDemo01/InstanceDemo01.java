package com.haobi.InstanceDemo01;
/*
 * 2.①调用无参构造实例化
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
		return "姓名:"+this.name+",年龄:"+this.age;
	}
}

public class InstanceDemo01 {
	public static void main(String[] args) {
		Class<?> c = null;//指定泛型
		try {
			c = Class.forName("com.haobi.InstanceDemo01.Person");//传入要实例化的完整包.类名称
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person per = null;//声明Person对象
		try {
			//实例化Person对象
			per = (Person)c.newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		per.setName("浩比");
		per.setAge(18);
		System.out.println(per);//内容输出，调用toString()
	}
}
