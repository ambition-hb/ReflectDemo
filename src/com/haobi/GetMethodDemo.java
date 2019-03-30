package com.haobi;
import java.lang.reflect.Method;//导入操作包
import java.lang.reflect.Modifier;//导入操作包
/*
 * 取得Person类的全部方法
 */
public class GetMethodDemo {
	public static void main(String[] args) {
		Class<?> c1 = null;//声明Class对象
		try {
			c1 = Class.forName("com.haobi.Person");//实例化Class对象
		} catch (Exception e) {
			e.printStackTrace();
		}
		Method m[] = c1.getMethods();//取得全部的方法
		for(int i=0;i<m.length;i++) {//循环输出
			Class<?> r = m[i].getReturnType();//得到方法的返回值类型
			Class<?> p[] = m[i].getParameterTypes();//得到全部的参数类型
			int xx = m[i].getModifiers();//得到方法的修饰符
			System.out.print(Modifier.toString(xx)+" ");//--修饰符
			System.out.print(r.getName()+" ");//--返回值类型
			System.out.print(m[i].getName());//--方法名
			System.out.print("(");//--左括号
			for(int x=0;x<p.length;x++) {
				System.out.print(p[x].getName()+" "+"arg"+x);//--参数
				if(x<p.length-1) {//判断是否输出参数的分割符","
					System.out.print(",");//--参数分隔符
				}
			}
			Class<?> ex[] = m[i].getExceptionTypes();//得到全部的异常抛出
			if(ex.length>0) {//有异常
				System.out.print(") throws");//--右括号+throws
			}else {//没有异常
				System.out.print(")");//--右括号
			}
			for(int j=0;j<ex.length;j++) {
				System.out.print(ex[j].getName());//--异常信息
				if(j<ex.length-1) {
					System.out.print(",");//--异常信息间隔符","
				}
			}
			System.out.println();//换行
		}
	}
}
