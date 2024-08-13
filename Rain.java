package lec12;

public class Rain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,3,1,8,2,4,5};
		System.out.println(Rain(arr));

	}
	public static int Rain(int[]arr) {
		int sum = 0;
		int n = arr.length;
		for(int i =0;i<arr.length;i++) {
			int  max = arr[0];
			for(int j = 0;j<=i;j++) {
				if(arr[j]>max) {
					max = arr[j];
				}
			}
			int ma  = arr[i];
			for(int k = i;k<n;k++) {
				if(arr[k]>ma) {
					ma = arr[k];
				}
			}
			sum = sum+Math.min(max, ma)-arr[i];
		}
		return sum;
		
	}

}
