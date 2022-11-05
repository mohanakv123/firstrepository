package pattern;

import java.util.Scanner;

public class Palindrom
{
	public static void main(String args[]) 
	{
		try (Scanner sc=new Scanner(System.in)){
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int original=num;
		int rev=0;
			while(num!=0) 
			{
			rev=rev*10+num%10;
			num=num/10;
			
		    }
		
	if(original==rev) 
		{
			System.out.println("Number are same Hence palindrom:"+rev);
		}
		else
		{
			System.out.println("Numbers are not same Hence Not palindrom:"+rev);
		}
			//System.out.println("Numbers are not same Hence Not palindrom:"+rev);
	}

}
}