package IMTprograms;

public class Remove_White_Space 
{
	public static void main(String args[])
	{
		String s="java bbb nn mm selenium   ";
		System.out.println("Before Removing White Space:  "+s);
		s=s.replaceAll("\\s", "");
		System.out.println();
		System.out.println("After Removing White Space:  "+s);
	}
}
