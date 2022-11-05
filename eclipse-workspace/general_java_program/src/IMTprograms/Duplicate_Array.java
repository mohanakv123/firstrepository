package IMTprograms;

import java.util.HashSet;

public class Duplicate_Array {

	public static void main(String[] args)
	{

		String arr[]= {"c++","mohan","c","java","java"};
		
		/*boolean boo=false;
		 * 
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("element fount:"+arr[i]);
					boo=true;
				}
			}
		}
		if(boo==false)
		System.out.println("element not fount:");*/
		
		//2)using HashSet
		boolean flag=false;
		
		 @SuppressWarnings({ "unchecked", "rawtypes" })
		 HashSet <String> langs=new  HashSet();
		 
		 for(String valus:arr)
		 {
		 boolean dub = langs.add(valus);
		 if(dub==false)
		 {
         System.out.println("dublicate element fount:"+dub+ "  "+valus);
		 flag=true;
		 }
		 }
		 
		 if(flag==false)
		 {
			 System.out.println("dublicate element not fount:");	 
		 }
	}

}
