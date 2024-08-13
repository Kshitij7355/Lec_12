package Lec12;

public class Wrapper_Class {

	public static void main(String[] args) {
		 int a =10;
		 Integer a1 = 20;
//		 Long l1 = 10l;
//		 long l2 = 11;
		 a1=a; // autoboxing
		 
		 int b = 78;
		 Integer b1 = 78;
		 b=b1;
		 System.out.println(b1);
		 
		 Integer c1 = 15;
		 Integer c2 = 15;
		 Integer c4 = 157;
		 Integer c5 = 157;
		 System.out.println(c1==c2);
		 System.out.println(c4==c5);
		 

	}

}
