package com.gaoxu.interview;

import java.util.Scanner;

public class Test22 {
	 public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("�������û�������");
	        //��¼�û�����
	        int n = sc.nextInt();
	        //���������鱣���û�����
	        int userNumber[] = new int[n];
	        //������һ���ַ������м��ÿո����
//	        System.out.println("������һ���ַ������м��ÿո����:");
//	        String str = sc.next();
//	        String st[] = str.split(" ");
	        for(int i=0;i<n;i++) {
	        	System.out.print("��"+i+"��:");
	        	userNumber[i] = sc.nextInt();
	        }
	        //���������������Ʋ�ѯ����
	        System.out.println("������һ�����������������Ʋ�ѯ������");
	        int m = sc.nextInt();
	        //����һ���ַ����飬�����洢��ѯֵ
	        
	        String st[] = new String[3];
	        //��ѭ�����Ʋ�ѯ����
	        for(int j = 0;j<m;j++) {
	        	System.out.println("�������ѯ��"+j+"�飺");
	        	 st[j]= sc.next();
	        }
	        int count = 0;
	        for(int a = 0;a<st.length;a++) {
	        	String strr = st[a];
	        	String strrr[] = strr.split("");
	        	
	        	String stttt = strrr[st.length-1];
	        	if(userNumber[a] == Integer.parseInt(stttt)) {
	        		count++;
	        		System.out.println(count);
	        		
	        	}
	        	
	        }
	       
	    }
}
