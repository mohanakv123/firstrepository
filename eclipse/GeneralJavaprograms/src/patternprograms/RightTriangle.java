package patternprograms;

//import java.util.Scanner;

public class RightTriangle {
	public static void main(String args[]) {
		int i,j,row=9;
		/*Scanner sc=new Scanner (System.in);
		System.out.println("enter the no of rows:");
		row=sc.nextInt();*/
	
		for(i=1;i<row;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" *");
		    }
	      
			System.out.println();
		
		}
		
			
	}

}
