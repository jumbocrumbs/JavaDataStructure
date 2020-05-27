package com.problem.arrays;

public class LeftRotation {

	public static void main(String[] args) {
		int[] arr= {1,3,5,6,7,9,10};
		int len= arr.length;
		int [] resArr=rotLeft(arr,2);
		System.out.println("Index of ele "+ resArr[4]);
		for(int ele: resArr) {
			System.out.print(ele + " ");
		}
	}

	static int[] rotLeft(int[] a, int d) {
		for(int i=0; i < d; i++){
			int temp= a[0];
			for(int j=1; j < a.length; j++){

				a[j-1] = a[j]; 
			}

			a[(a.length)-1]= temp;

		}
		return a;
	}

}
