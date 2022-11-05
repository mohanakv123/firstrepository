package patternprograms;

import java.util.Scanner;

public class Swaping {
	public static void main(String args[]) {
		int a,b;
		try( Scanner s = new Scanner(System.in)) {
			System.out.println("enter the number to swap:");
			a=s.nextInt();
			b=s.nextInt();
		}
		System.out.println("before swaping number are:" +a+" "+b);
	    //using temporary (three) variable 
		
		//here we need to declare another temp variable to swap
		
		/*temp=a;
		a=b;
		b=temp;
		
		using only two variable with the help of arthamtic operator
		
		a=a-b;
		b=a+b;
		a=b-a;*/
		
		//using only two variable with the help of bitwise operator
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("after swping number are:" +a+" "+b);
	}

	
}
