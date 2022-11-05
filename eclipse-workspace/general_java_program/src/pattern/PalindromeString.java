package pattern;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		String original=str;
		int l=str.length();
		String rev="";
		for(int i=l-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
			
		}
		System.out.println("Reversed Sring is " +rev);
	     if(original.equals(rev))
	
		System.out.println(original+" "+"String is palindrome");
	
	     else
     	{
	
		System.out.println(original+" "+"String is not palindrome");
	
     	}
	}

}
