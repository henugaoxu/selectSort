package com.gaoxu.interview;

import java.util.Scanner;

public class SortElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//控制数组元素个数
		System.out.println("请输入数组元素个数：");
		int n = sc.nextInt();
		//从键盘上输入数字进行操作
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			System.out.println("请输入数组元素：第"+(i+1)+"个");
			arr[i] = sc.nextInt();
		}
		
        System.out.println();
        
        while(true) {
        	System.out.println("*****************排序算法*****************");
        	System.out.println("****************1.冒泡排序****************");
        	System.out.println("****************2.选择排序****************");
        	System.out.println("****************3.快速算法****************");
        	System.out.println("****************4.插入排序****************");
        	System.out.println("****************5.希尔排序****************");
        	System.out.println("****************6.堆排序*****************");
        	System.out.println("****************7.归并排序****************");
        	System.out.println("请选择排序算法:");
        	int x = sc.nextInt();
        	switch(x) {
        	     case 1:bubbleSort(arr);
        	     case 2:selectSort(arr);
        	     case 3:quickSort(arr, x, x);
        	     case 4:
        	     case 5:
        	     case 6:
        	     case 7:
        	}
        	
        	
        }
        
	}

    //冒泡排序
	public static void bubbleSort(int arr[]) {
		System.out.print("排序前：");
        for(int b = 0;b < arr.length;b++ ) {
        	System.out.print(arr[b]+" ");
        }
        System.out.println();
    	for(int i = 0;i<arr.length-1;i++) {
    		for(int j = 0;j<arr.length-1-i;j++) {
    			if(arr[j]>arr[j+1]) {
    				int temp = arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1] = temp;
    			}
    		}
    	}
    	System.out.println();
    	System.out.print("排序后：");
        for(int a= 0;a < arr.length;a++ ) {
        	System.out.print(arr[a]+" ");
        }
        System.out.println();
    }
    //选择排序
	public static void selectSort(int arr[]) {
		System.out.println("排序前：");
		for (int a : arr) {
			System.out.print(a+"");
		}
		System.out.println();
		//定义转换变量temp
		int temp;
		//控制循环的趟数
		for(int j = 0;j<arr.length-1;j++) {
		    //找出最小元素的位置
			int k = j;
			//寻找最小元素，并返回其下标
			for(int i = k+1;i<arr.length;i++) {
				if(arr[i]<arr[k]) {
					k=i;
				}
			}
			if(j!=k) {
				temp = arr[j];
				arr[j] = arr[k];
				arr[k] = temp;
			}
		}
		System.out.println("排序后：");
		for (int b : arr) {
			System.out.print(b+" ");
		}
		System.out.println();
	}
    //快速排序
	public static void quickSort(int arr[],int start,int end) {
		//第一步确定基准值
		int base = arr[end];
		while(start<end) {
			while(start<end&&arr[start]<=base)
				start++;
			if(start<end) {
				
			}
		}
	}
}
