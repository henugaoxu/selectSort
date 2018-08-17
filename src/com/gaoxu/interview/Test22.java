package com.gaoxu.interview;

import java.util.Scanner;

public class Test22 {
	 public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("请输入用户个数：");
	        //记录用户个数
	        int n = sc.nextInt();
	        //创建个数组保存用户个数
	        int userNumber[] = new int[n];
	        //请输入一窗字符串，中间用空格隔开
//	        System.out.println("请输入一窗字符串，中间用空格隔开:");
//	        String str = sc.next();
//	        String st[] = str.split(" ");
	        for(int i=0;i<n;i++) {
	        	System.out.print("第"+i+"个:");
	        	userNumber[i] = sc.nextInt();
	        }
	        //正整数，用来控制查询组数
	        System.out.println("请输入一个正整数，用来控制查询组数：");
	        int m = sc.nextInt();
	        //创建一个字符数组，用来存储查询值
	        
	        String st[] = new String[3];
	        //此循环控制查询组数
	        for(int j = 0;j<m;j++) {
	        	System.out.println("请输入查询第"+j+"组：");
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
