package IMTprograms;

//import java.util.Arrays;

public class CheckArrayEqual {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,7,8};
	
		/*boolean status=Arrays.equals(a, b);
		if (status==true) 
		{
			System.out.println("equals");
		}
		else 
		{
			System.out.println(" not equals");
		}*/
			
		
		boolean status=true;
		
		if(a.length==b.length)
		{
			for(int i=0;i<b.length;i++)
			{
				if(a[i]!=b[i])
				{
					status=false;
				}
			
			}
			if(status==true)
			{
				System.out.println("arrays are equal");
				
			}
			else
			{
				System.out.println("arrays are not equal");
				
			}
		}
		else
		{
			System.out.println("arrays l are not equal");
		}
		
		}
	}


