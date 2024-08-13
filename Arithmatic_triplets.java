package Lec12;

import java.util.Arrays;
import java.util.Scanner;

public class Arithmatic_triplets {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		int diff=s.nextInt();
		System.out.println(Sum(arr,diff));

				
	}
	public static int Sum(int[]arr,int diff) {
		Arrays.sort(arr);
		int count=0;
		for(int i=0;i<arr.length-2;i++) {
			int j=i+1;
			int k=arr.length-1;
			while(j<k) {
				if(arr[j]-arr[i]==diff && arr[k]-arr[j]==diff) {
					count++;
					j++;
					k--;
				}
				else if(arr[j]-arr[i]<diff) {
					j++;
				}
				else {
					k--;
				}
			}
		}
		return count++;
	
	}

}
