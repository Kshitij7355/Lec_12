package lec12;
import java.util.*;
public class inserion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int []arr = new int[n];
		for(int j =0;j<arr.length;j++) {
			arr[j]=s.nextInt();
		}
		Sort(arr);
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}
	public static void Sort(int[] arr) {
		for(int i = 1; i<arr.length;i++) {
			int picked = arr[i];
			int j = i- 1;
			while(j>=0 && arr[j]>picked) {
				arr[j+1] = arr[i];
				j--;
				
			}
			arr[j+1]=picked;
		}
	}

	}


