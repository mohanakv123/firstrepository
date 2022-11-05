package patternprograms;

import java.util.Scanner;

public class PyramidPattern {
	public static void main(String args[]) {
    int i,j,row;
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the no:");
	row=sc.nextInt();
	
		for (i=1;i<=row-1;i++)
		{
		   for(j=row-i;j>1;j--)
				{
					System.out.print(" ");
			
				}
	  
			for(j=1;j<=i;j++)
			    {
				   System.out.print("* ");
		        }
	      
			System.out.println();
		
		}
		
			
	}

}


