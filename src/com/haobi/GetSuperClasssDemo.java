package com.haobi;
/*
 * ȡ��Person�ĸ���
 */
public class GetSuperClasssDemo {
	public static void main(String[] args) {
		Class<?> c1 = null;//����Class����
		try {
			c1 = Class.forName("com.haobi.Person");//ʵ����Class����
		} catch (Exception e) {
			e.printStackTrace();
		}
		Class<?> c2 = c1.getSuperclass();//ȡ�ø���
		System.out.println("�������ƣ�"+c2.getName());//�����Ϣ
	}
}
