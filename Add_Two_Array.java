package Lec12;

import java.util.ArrayList;
import java.util.Scanner;

public class Add_Two_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m=s.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int[]brr= new int[m];
		for(int i=0;i<brr.length;i++) {
			brr[i]=s.nextInt();
		}
		ArrayList<Integer> ll = new ArrayList<>();
		Add(arr,brr,ll);

	}
	public static void Add(int[]arr,int[]brr, ArrayList<Integer> ll) {
		
		int carr=0;
		int i=arr.length-1;
		int j=brr.length-1;
		while(i>=0 && j>=0) {
			int sum=arr[i]+brr[j]+carr;
			ll.add(sum%10);
			carr=sum/10;
			i--;
			j--;
			
		}
		while(i>=0) {
			int sum=arr[i]+carr;
			ll.add(sum%10);
			carr=sum/10;
			i--;
		}
		while(j>=0) {
			int sum=brr[j]+carr;
			ll.add(sum%10);
			carr=sum/10;
			j--;
			
		}
		for(int k=ll.size()-1;k>=0;k--) {
			System.out.print(ll.get(k)+" ");
		}
	}

}
