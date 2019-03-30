package com.haobi;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
/*
 * 取得Person类中的属性
 */
public class GetFieldDemo {
	public static void main(String[] args) {
		Class<?> c1 = null;//声明Class对象
		try {
			c1 = Class.forName("com.haobi.Person");//实例化Class对象
		} catch (Exception e) {
			e.printStackTrace();
		}
		Field f1[] = c1.getDeclaredFields();//取得本类属性
		for(int i=0;i<f1.length;i++) {
			System.out.println("本类属性:"+f1[i]);
		}
		Field f2[] = c1.getFields();//取得父类的公共属性
		for(int j=0;j<f2.length;j++) {
			System.out.println("接口或父类的公共属性:"+f2[j]);
		}
	}
}
