package Lec12;

import java.util.ArrayList;

public class Array_List_Working {

	public static void main(String[] args) {
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
		int[]arr = {1,2,3,4,5};
		for(int v:ll) {
			System.out.print(v+" ");
		}
		System.out.println();
		for(int i :arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		char[]a= {'a','b','c'};
		for(char v:a) {
			System.out.print(v+" ");
		}
		System.out.println();
		char a1 = 'b';
		System.out.println(a1);

	}

}
