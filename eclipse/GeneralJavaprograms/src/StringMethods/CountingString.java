package StringMethods;

public class CountingString {
	public static void main(String args[]) {
		String s="mohana kalegowda vajra LEARING JAVA";
		String s1=" AND selenium";
		int a=s.length(),c=0;//d=0;
		System.out.println("The First string is:");
		System.out.println(s);
		System.out.println();
		System.out.println("The Second string is:");
		System.out.println(s1);
		System.out.println();
		/*for(int j=0;j<a;j++)
			
		{
			s1.charAt(j);
			d++;
			System.out.println("the position of char "+	s1.charAt(j)+" is " +d);	
		}*/
		for(int i=0;i<a;i++)
		{
			 s.charAt(i);
			 c++;
			System.out.println("the position of char "+	s.charAt(i)+" is " +c);
	
		}
		//Total String Count
		System.out.println("Total String Count Is:"+c);
		System.out.println();
		
		//The converted upper case are
		System.out.println("The upper case are:");
		System.out.println(s.toUpperCase());
		System.out.println();
		
		//The converted lower case are
		System.out.println("The lower case are:");
		System.out.println(s.toLowerCase());
		System.out.println();
		
		//The cancatanation of two String is
		System.out.println("The cancatanation of two String is:");
		System.out.println(s.concat(s1));
	}	

}
