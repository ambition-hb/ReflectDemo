package com.haobi;
/*
 * ȡ��Person����ʵ�ֵ�ȫ���ӿ�
 */
public class GetInterfaceDemo {
	public static void main(String[] args) {
		Class<?> c1 = null;//����Class����
		try {
			c1 = Class.forName("com.haobi.Person");//ʵ����Class����
		} catch (Exception e) {
			e.printStackTrace();
		}
		Class<?> c[] = c1.getInterfaces();//ȡ��ʵ�ֵ�ȫ���ӿ�
		for(int i=0;i<c.length;i++) {
			System.out.println("ʵ�ֵĽӿ����ƣ�"+c[i].getName());//����ӿڵ�����
		}
	}
}
