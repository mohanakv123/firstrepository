package pattern;

import java.util.Scanner;

public class Counting_Sumof_Digit {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Numers:");
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("sum of number is: "+sum);

	}

}
