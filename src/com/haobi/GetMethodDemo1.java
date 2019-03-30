package com.haobi;
/*
 * 取得Person类的全部方法
 */
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GetMethodDemo1 {
	public static void main(String[] args) {
		Class<?> c1 = null;//声明Class对象
		try {
			c1 = Class.forName("com.haobi.Person");//实例化Class对象
		} catch (Exception e) {
			e.printStackTrace();
		}
		Method m[] = c1.getMethods();//取得全部的方法
		for(int i=0;i<m.length;i++) {//循环输出
			System.out.println("全部方法:"+m[i]);
		}
	}
}
