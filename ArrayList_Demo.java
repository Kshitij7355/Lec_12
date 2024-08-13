package Lec12;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo {

	public static void main(String[] args) {
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll.size());
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(2,-6);//range
		Collections.sort(ll);
		System.out.println(ll);
		System.out.println(ll.size());
		
		// get
		System.out.println(ll.get(2));
//		Collections.reverse(ll);
		System.out.println(ll);
		
		//set
		ll.set(3,90);
		System.out.println(ll);
		//remove
		ll.remove(1);
		System.out.println(ll);
		

	}

}
