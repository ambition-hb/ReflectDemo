package com.haobi;
/*
 * 取得Person的父类
 */
public class GetSuperClasssDemo {
	public static void main(String[] args) {
		Class<?> c1 = null;//声明Class对象
		try {
			c1 = Class.forName("com.haobi.Person");//实例化Class对象
		} catch (Exception e) {
			e.printStackTrace();
		}
		Class<?> c2 = c1.getSuperclass();//取得父类
		System.out.println("父类名称："+c2.getName());//输出信息
	}
}
