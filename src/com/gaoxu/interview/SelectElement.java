package com.gaoxu.interview;

import java.util.Scanner;

public class SelectElement {
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("请输入你要放入的元素个数：");
    	   int n = sc.nextInt();
    	   int arr[] = new int[n];
    	   
    	  
    	   
    	   for(int j = 0;j<n;j++){
    		   System.out.println("第"+j+"个：");
    		   arr[j]= sc.nextInt();
    	   }
    	   for(int b = 0;b<arr.length;b++) {
    		   System.out.print(arr[b]+" ");
    	   }
    	   while(true) {
    		   System.out.println();
    		   System.out.println("*************1.顺序查找*************");
    		   System.out.println("*************2.普通版二分查找*************");
    		   System.out.println("*************3.递归版二分查找*************");
    		   System.out.println("*************4.程序结束*************");
    		   System.out.println("请输入您要查找的方法：");
    		   int m = sc.nextInt();
    		   System.out.println("请输入你要查找的值：");
    		   int value = sc.nextInt();
    		   switch(m) {
    		       
    		       case 1:SquenceSerach(arr, value, n);
    		       case 2:BinarySerach(arr, value, n-1);
    		       case 3:BinarySerachSory(arr,value,0,n-1);
    		       case 4:InsertElementSerach(arr,value,0,n-1);
    		       
    		   }
    		   
    	   }
		
	}
       //顺序查找
       public static void SquenceSerach(int arr[],int value,int n) {
    		for(int i=0;i<n;i++) {
    			if(value==arr[i]) {
    				System.out.println("顺序元素查找成功！");
    				System.out.println("数据元素的下标为:"+i);
    			}
    		}
       } 
       //二分查找（普通版）
       public static void BinarySerach(int arr[],int value,int n) {
    	   int left,right,mid;
    	   left = 0;
    	   right = n;
    	   
    	   while(left<=right) {
    		   
    		   mid = (left+right)/2;
    		   System.out.println("中间值："+mid);
    		   if(arr[mid]==value) {
    			   System.out.println("查询成功！"+arr[mid]+"\r\n数值下标："+mid);
    			   break;
    		   }
    		   else if(value<arr[mid]){
    			  right = mid-1;
    			  System.out.println("左右变化值："+right);
    		   }
    		   else if(value>arr[mid]){
    			  left = mid+1;
    		   }
    		   
    	   }
    	   
       }
     //二分查找（递归版）
       public static int BinarySerachSory(int arr[],int value,int left,int right) {
    	       int mid = left+right;
    	       if(value==arr[mid]) {
   			       System.out.println("查询成功！"+arr[mid]);
   			       
   		       }
	   		   else if(value<arr[mid]){
	   			  return BinarySerachSory(arr,value,left,mid-1);
	   		   }
	   		   else if(value>arr[mid]){
	   			return BinarySerachSory(arr,value,mid+1,right);
	   		   }
			return -1;
       }
     //插值查找
       public static int InsertElementSerach(int arr[],int value,int left,int right) {
    	      int mid = left+((value-left)/(arr[right]-arr[left]))*(right-left);
    	      if(value==arr[mid]) {
  			       System.out.println("查询成功！"+arr[mid]);
  			       
  		       }
	   		   else if(value<arr[mid]){
	   			  return InsertElementSerach(arr,value,left,mid-1);
	   		   }
	   		   else if(value>arr[mid]){
	   			return InsertElementSerach(arr,value,mid+1,right);
	   		   }
		      return 0;
    	   
       }
       //斐波那契查找
       
}

