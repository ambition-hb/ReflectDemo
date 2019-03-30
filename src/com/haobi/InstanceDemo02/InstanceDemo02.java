package com.haobi.InstanceDemo02;
import java.lang.reflect.Constructor;//导入反射包
/*
 * 2.②调用有参构造实例化
 */
class Person{
	private String name;
	private int age;
	public Person(String name, int age) {//通过构造设置属性内容
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
		return "姓名:"+this.name+",年龄:"+this.age;
	}
}

public class InstanceDemo02 {
	public static void main(String[] args) {
		Class<?> c = null;//指定泛型
		try {
			c = Class.forName("com.haobi.InstanceDemo02.Person");//传入要实例化的完整包.类名称
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person per = null;//声明Person对象
		Constructor<?> cons[] = null;//声明一个表示构造方法的数组
		cons = c.getConstructors();//通过反射取得全部构造
		try {
			//向构造方法中传递参数，此方法使用可变参数接收，并实例化对象
			per = (Person)cons[0].newInstance("浩比",18);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(per);//内容输出，调用toString()
	}
}
