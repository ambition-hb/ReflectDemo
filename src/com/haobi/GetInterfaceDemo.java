package com.haobi;
/*
 * 取得Person类所实现的全部接口
 */
public class GetInterfaceDemo {
	public static void main(String[] args) {
		Class<?> c1 = null;//声明Class对象
		try {
			c1 = Class.forName("com.haobi.Person");//实例化Class对象
		} catch (Exception e) {
			e.printStackTrace();
		}
		Class<?> c[] = c1.getInterfaces();//取得实现的全部接口
		for(int i=0;i<c.length;i++) {
			System.out.println("实现的接口名称："+c[i].getName());//输出接口的名称
		}
	}
}
