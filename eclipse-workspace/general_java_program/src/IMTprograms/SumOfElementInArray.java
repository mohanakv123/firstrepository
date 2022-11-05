package IMTprograms;

public class SumOfElementInArray {
	public static void main(String  args[]) {
		int a[]= {1,4,5,8,2,4,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println("Sum of array is:"+sum);
	}

}
