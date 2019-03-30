package com.haobi;
import java.lang.reflect.Constructor;//导入反射操作包
/*
 * 取得Perosn类中的全部构造方法
 */
public class GetConstructorDemo {
	public static void main(String[] args) {
		Class<?> c1 = null;//声明Class对象
		try {
			c1 = Class.forName("com.haobi.Person");//实例化Class对象
		} catch (Exception e) {
			e.printStackTrace();
		}
		Constructor<?> con[] = c1.getConstructors();//取得全部构造方法
		for(int i=0;i<con.length;i++) {//循环输出
			System.out.println("构造方法:"+con[i]);
		}
	}
}
