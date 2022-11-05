package patternprograms;

public class CountingAdd_even_number {
	public static void main(String args[]) {
	int a[]={1,2,3,4,5,6,9,3,2,5,7,9,1};
	int even=0,odd=0,i;
	int l=a.length;
    System.out.print("Even Numbers are:");
	{

	for (i=0;i<l;i++) 
		if(a[i]%2==0)
		{
	    even++;
	
	    System.out.println();
	    System.out.print(a[i]);
		}
        
	}		 
	{
		System.out.println();
		System.out.println("odd  Numbers Are:");
	    for (i=0;i<l;i++)
		if(a[i]%2!=0)
		{ 
		odd++;
		
		System.out.println( a[i]);
		}
		
	
	}
	    System.out.println();
		System.out.println("Even Numbers Count Are:"+even);
		System.out.println("ODD  Number  count are:"+odd);

}
}