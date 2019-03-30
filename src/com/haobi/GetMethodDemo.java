package com.haobi;
import java.lang.reflect.Method;//���������
import java.lang.reflect.Modifier;//���������
/*
 * ȡ��Person���ȫ������
 */
public class GetMethodDemo {
	public static void main(String[] args) {
		Class<?> c1 = null;//����Class����
		try {
			c1 = Class.forName("com.haobi.Person");//ʵ����Class����
		} catch (Exception e) {
			e.printStackTrace();
		}
		Method m[] = c1.getMethods();//ȡ��ȫ���ķ���
		for(int i=0;i<m.length;i++) {//ѭ�����
			Class<?> r = m[i].getReturnType();//�õ������ķ���ֵ����
			Class<?> p[] = m[i].getParameterTypes();//�õ�ȫ���Ĳ�������
			int xx = m[i].getModifiers();//�õ����������η�
			System.out.print(Modifier.toString(xx)+" ");//--���η�
			System.out.print(r.getName()+" ");//--����ֵ����
			System.out.print(m[i].getName());//--������
			System.out.print("(");//--������
			for(int x=0;x<p.length;x++) {
				System.out.print(p[x].getName()+" "+"arg"+x);//--����
				if(x<p.length-1) {//�ж��Ƿ���������ķָ��","
					System.out.print(",");//--�����ָ���
				}
			}
			Class<?> ex[] = m[i].getExceptionTypes();//�õ�ȫ�����쳣�׳�
			if(ex.length>0) {//���쳣
				System.out.print(") throws");//--������+throws
			}else {//û���쳣
				System.out.print(")");//--������
			}
			for(int j=0;j<ex.length;j++) {
				System.out.print(ex[j].getName());//--�쳣��Ϣ
				if(j<ex.length-1) {
					System.out.print(",");//--�쳣��Ϣ�����","
				}
			}
			System.out.println();//����
		}
	}
}
