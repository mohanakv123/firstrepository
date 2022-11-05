package IMTprograms;

public class CountingCharacterNumber {

	public static void main(String[] args)
	{
		String s="java is very easy to learn";
		System.out.println("The Original String is:"+s);
		int total_count=s.length();
		System.out.println(total_count);
	    s=s.replace("a", "");
		int Atrer_count=s.length();
		System.out.println("After Removing Charcter in String is:"+s);
		System.out.println(Atrer_count);
		int count=total_count-Atrer_count;
		System.out.println("Number of Occarace in the Srting is:"+count);
		

	}

}
