package com.gaoxu.interview;

import java.util.Scanner;

public class SelectElement {
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("��������Ҫ�����Ԫ�ظ�����");
    	   int n = sc.nextInt();
    	   int arr[] = new int[n];
    	   
    	  
    	   
    	   for(int j = 0;j<n;j++){
    		   System.out.println("��"+j+"����");
    		   arr[j]= sc.nextInt();
    	   }
    	   for(int b = 0;b<arr.length;b++) {
    		   System.out.print(arr[b]+" ");
    	   }
    	   while(true) {
    		   System.out.println();
    		   System.out.println("*************1.˳�����*************");
    		   System.out.println("*************2.��ͨ����ֲ���*************");
    		   System.out.println("*************3.�ݹ����ֲ���*************");
    		   System.out.println("*************4.�������*************");
    		   System.out.println("��������Ҫ���ҵķ�����");
    		   int m = sc.nextInt();
    		   System.out.println("��������Ҫ���ҵ�ֵ��");
    		   int value = sc.nextInt();
    		   switch(m) {
    		       
    		       case 1:SquenceSerach(arr, value, n);
    		       case 2:BinarySerach(arr, value, n-1);
    		       case 3:BinarySerachSory(arr,value,0,n-1);
    		       case 4:InsertElementSerach(arr,value,0,n-1);
    		       
    		   }
    		   
    	   }
		
	}
       //˳�����
       public static void SquenceSerach(int arr[],int value,int n) {
    		for(int i=0;i<n;i++) {
    			if(value==arr[i]) {
    				System.out.println("˳��Ԫ�ز��ҳɹ���");
    				System.out.println("����Ԫ�ص��±�Ϊ:"+i);
    			}
    		}
       } 
       //���ֲ��ң���ͨ�棩
       public static void BinarySerach(int arr[],int value,int n) {
    	   int left,right,mid;
    	   left = 0;
    	   right = n;
    	   
    	   while(left<=right) {
    		   
    		   mid = (left+right)/2;
    		   System.out.println("�м�ֵ��"+mid);
    		   if(arr[mid]==value) {
    			   System.out.println("��ѯ�ɹ���"+arr[mid]+"\r\n��ֵ�±꣺"+mid);
    			   break;
    		   }
    		   else if(value<arr[mid]){
    			  right = mid-1;
    			  System.out.println("���ұ仯ֵ��"+right);
    		   }
    		   else if(value>arr[mid]){
    			  left = mid+1;
    		   }
    		   
    	   }
    	   
       }
     //���ֲ��ң��ݹ�棩
       public static int BinarySerachSory(int arr[],int value,int left,int right) {
    	       int mid = left+right;
    	       if(value==arr[mid]) {
   			       System.out.println("��ѯ�ɹ���"+arr[mid]);
   			       
   		       }
	   		   else if(value<arr[mid]){
	   			  return BinarySerachSory(arr,value,left,mid-1);
	   		   }
	   		   else if(value>arr[mid]){
	   			return BinarySerachSory(arr,value,mid+1,right);
	   		   }
			return -1;
       }
     //��ֵ����
       public static int InsertElementSerach(int arr[],int value,int left,int right) {
    	      int mid = left+((value-left)/(arr[right]-arr[left]))*(right-left);
    	      if(value==arr[mid]) {
  			       System.out.println("��ѯ�ɹ���"+arr[mid]);
  			       
  		       }
	   		   else if(value<arr[mid]){
	   			  return InsertElementSerach(arr,value,left,mid-1);
	   		   }
	   		   else if(value>arr[mid]){
	   			return InsertElementSerach(arr,value,mid+1,right);
	   		   }
		      return 0;
    	   
       }
       //쳲���������
       
}

