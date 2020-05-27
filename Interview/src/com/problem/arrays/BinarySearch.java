package com.problem.arrays;

public class BinarySearch {
	public static int searchEle(int[] arr,int low,int high,int val) {
		int mid = low+ (high-1)/2;
		
		if(low > high) {
			return -1;
		}
		
		if(val == arr[mid]) {
			return mid;
		}
		
		if(val > arr[mid]) {
			return searchEle(arr,mid +1,high,val);
		}
		return searchEle(arr,low,mid-1,val);
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,3,5,6,7,9,10};
		int len= arr.length;
		int index=searchEle(arr,0,len-1,9);
		System.out.println("Index of ele "+ index);
	}

}
