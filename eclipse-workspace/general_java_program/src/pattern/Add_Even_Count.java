package pattern;

import java.util.Scanner;

public class Add_Even_Count {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Numers:");
		int num=sc.nextInt();
		int add=0,even=0;
	
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
	           even++;
				
			}
			else
			{
				add++;
			}
			num=num/10;
			
		}
	 

		System.out.println("Even number Count Are:"+even);
		System.out.println("odd  number Count Are:"+add);
	}

}
