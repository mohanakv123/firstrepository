package IMTprograms;

public class MAX_MIN_In_Array 
{
public static void main(String args[])
{
	int a[]= {2,9,3,4,5,6,7};
	 
	int num=a[0];
	
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>num)
		{
			num=a[i];
			
		}
	}
	
	System.out.println("max number: "+num);
	num=a[0];
	
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<num)
		{
			num=a[i];
		}
		
	}
	
	System.out.println("min number: "+num);
	
	
}
}
