package IMTprograms;

import java.util.Arrays;
import java.util.Collections;

public class Array_Builtin_Method_ToSort 
{   
	public static void main(String args[])
	{
		//1)Approach
		//int a[]= {1,23,3,5,6,7,4};
		
		/*Arrays.parallelSort(a);
		System.out.println("Sorted Order:"+Arrays.toString(a));
		System.out.println("Sorted Order:"+Arrays.toString(a));*/
		
		
		//2)Approach
		/*System.out.println("Sorted Order:"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorted Order:"+Arrays.toString(a));*/
		
		//3)Reversing Array
		
	Integer a[]= {1,23,3,5,6,7,4};
	System.out.println("Sorted Order:"+Arrays.toString(a));	
	Arrays.sort(a,Collections.reverseOrder());
	System.out.println("Sorted Order:"+Arrays.toString(a));
		
		
		
		
	}

}
