package lec12;

public class Sum_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,7,11,15};
		int target = 9;
		Sum(arr,target);

	}
	 public static void Sum(int[]arr,int target){
	        
	        int n = arr.length;
	        
	        for(int i =0 ;i<n-1;i++) {
	        	for(int j =i+1;j<n-1;j++) {
	        		if(arr[i]+arr[j]==target) {
	        			
	        		}
	        	}
	        	
	        }
	       
	        
	        
	        
	        
	        
	    }
}


