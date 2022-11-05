package pattern;

import java.util.Scanner;

public class LargestOf3Number {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the three number:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	/* if(a>b&&a<c)
	 {
		 System.out.println(a+"largest number");
	 }
	 else if(b<a&&b<c)
	 {
		 System.out.println(b+"largest number");	
		 
	 }
	 else
	 {
		 System.out.println(c+"largest number");
	 }*/
	
	
	 int lar=a>b?a:b;
     int lar1=c>(a>b?a:b)?c:lar;
	 System.out.println(lar1+"largest number");
	 }

	}


