package IMTprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the foctorialnumber:");
		  int num=sc.nextInt();
		  int fact=1;
		  for(int i=1;i<=num;i++)
		  {
			 fact=fact*i;
		  }
		  System.out.println("Factorial number are : "+fact);
	}
      

	}

}