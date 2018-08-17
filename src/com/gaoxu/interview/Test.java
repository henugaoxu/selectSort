package com.gaoxu.interview;

public class Test {

	public static void main(String[] args) {
		//实现字符串加减法
		String str = "12-18+32*4446";
		String st[] = str.split("");
		//定义两个数组用来记录数值和符号
		//用来记录数值,
		String a[] = new String[st.length];
		//用来记录符号
		String b[]= new String[st.length];
		
		for(int i = 0;i< st.length;i++) {
			
			if(st[i].equals("0")||st[i].equals("1")||st[i].equals("2")||st[i].equals("3")||st[i].equals("4")||st[i].equals("5")||st[i].equals("6")||st[i].equals("7")||st[i].equals("8")||st[i].equals("9")){
				a[i] = st[i];
			}
			if(st[i].equals("+")||st[i].equals("-")||st[i].equals("*")||st[i].equals("/")) {
                     b[i] = st[i];
			}
		}
		String ss= "";
		String sss[]=new String[a.length];
		for(int i= 0;i<a.length;i++) {
			    ss = ss+a[i];
			    System.out.println(ss);
//			    if(ss.equals("null")) {
//			    	System.out.println();
//			    	sss[i]= ss;
//			    }
			   // System.out.println("sss:"+sss[i]+" ");
//				if(a[i]==null) {
//					ss="";
//				}
		}
		
		//System.out.println(ss);
		
	}
	public static String stringInsert(String a,String b,int t){
		return a.substring(0,t)+b+a.substring(t+1, 10);
	}
}