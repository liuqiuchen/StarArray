package com.stararray;
/**
 * ������ϵͳ
 * Javaѭ������ж���ѭ��
 * 
 * =====================����Java������Console����̨���в鿴���========================
 * */
public class MyStarArray {
	public static void main(String[] arg){	//��������
		
		System.out.println("��ӡֱ��������");
        
		for(int i = 1;i <= 5;i++){	//�涨��5��
			for(int j = 1;j <= i;j++){	//����ÿ�еĸ���
				System.out.print("*");
			}
			
			//ÿ��ӡ��һ�к���л���
			System.out.println();
		}
		
	}
}
/**
 * System.out.println()��System.out.print()������
 * System.out.println()�����Ϣ��ỻ�У�
 * System.out.print()�����Ϣ�󲻻ỻ��
 */
