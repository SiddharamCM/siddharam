package com.s1;

public class ArrayPgr {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int value=10;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=value;
			value=value+10;
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
