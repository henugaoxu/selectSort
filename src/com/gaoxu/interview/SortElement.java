package com.gaoxu.interview;

import java.util.Scanner;

public class SortElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//��������Ԫ�ظ���
		System.out.println("����������Ԫ�ظ�����");
		int n = sc.nextInt();
		//�Ӽ������������ֽ��в���
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			System.out.println("����������Ԫ�أ���"+(i+1)+"��");
			arr[i] = sc.nextInt();
		}
		
        System.out.println();
        
        while(true) {
        	System.out.println("*****************�����㷨*****************");
        	System.out.println("****************1.ð������****************");
        	System.out.println("****************2.ѡ������****************");
        	System.out.println("****************3.�����㷨****************");
        	System.out.println("****************4.��������****************");
        	System.out.println("****************5.ϣ������****************");
        	System.out.println("****************6.������*****************");
        	System.out.println("****************7.�鲢����****************");
        	System.out.println("��ѡ�������㷨:");
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

    //ð������
	public static void bubbleSort(int arr[]) {
		System.out.print("����ǰ��");
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
    	System.out.print("�����");
        for(int a= 0;a < arr.length;a++ ) {
        	System.out.print(arr[a]+" ");
        }
        System.out.println();
    }
    //ѡ������
	public static void selectSort(int arr[]) {
		System.out.println("����ǰ��");
		for (int a : arr) {
			System.out.print(a+"");
		}
		System.out.println();
		//����ת������temp
		int temp;
		//����ѭ��������
		for(int j = 0;j<arr.length-1;j++) {
		    //�ҳ���СԪ�ص�λ��
			int k = j;
			//Ѱ����СԪ�أ����������±�
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
		System.out.println("�����");
		for (int b : arr) {
			System.out.print(b+" ");
		}
		System.out.println();
	}
    //��������
	public static void quickSort(int arr[],int start,int end) {
		//��һ��ȷ����׼ֵ
		int base = arr[end];
		while(start<end) {
			while(start<end&&arr[start]<=base)
				start++;
			if(start<end) {
				
			}
		}
	}
}
