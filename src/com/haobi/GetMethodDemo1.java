package com.haobi;
/*
 * ȡ��Person���ȫ������
 */
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GetMethodDemo1 {
	public static void main(String[] args) {
		Class<?> c1 = null;//����Class����
		try {
			c1 = Class.forName("com.haobi.Person");//ʵ����Class����
		} catch (Exception e) {
			e.printStackTrace();
		}
		Method m[] = c1.getMethods();//ȡ��ȫ���ķ���
		for(int i=0;i<m.length;i++) {//ѭ�����
			System.out.println("ȫ������:"+m[i]);
		}
	}
}
