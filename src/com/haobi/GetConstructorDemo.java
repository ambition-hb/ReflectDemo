package com.haobi;
import java.lang.reflect.Constructor;//���뷴�������
/*
 * ȡ��Perosn���е�ȫ�����췽��
 */
public class GetConstructorDemo {
	public static void main(String[] args) {
		Class<?> c1 = null;//����Class����
		try {
			c1 = Class.forName("com.haobi.Person");//ʵ����Class����
		} catch (Exception e) {
			e.printStackTrace();
		}
		Constructor<?> con[] = c1.getConstructors();//ȡ��ȫ�����췽��
		for(int i=0;i<con.length;i++) {//ѭ�����
			System.out.println("���췽��:"+con[i]);
		}
	}
}
