package com.haobi;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
/*
 * ȡ��Person���е�����
 */
public class GetFieldDemo {
	public static void main(String[] args) {
		Class<?> c1 = null;//����Class����
		try {
			c1 = Class.forName("com.haobi.Person");//ʵ����Class����
		} catch (Exception e) {
			e.printStackTrace();
		}
		Field f1[] = c1.getDeclaredFields();//ȡ�ñ�������
		for(int i=0;i<f1.length;i++) {
			System.out.println("��������:"+f1[i]);
		}
		Field f2[] = c1.getFields();//ȡ�ø���Ĺ�������
		for(int j=0;j<f2.length;j++) {
			System.out.println("�ӿڻ���Ĺ�������:"+f2[j]);
		}
	}
}
