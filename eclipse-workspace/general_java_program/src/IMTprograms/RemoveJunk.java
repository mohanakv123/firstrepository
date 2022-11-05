package IMTprograms;

public class RemoveJunk 
{
   public static void main(String args[])
   {
	  String s="!@#$%^&*() mohan  )(*&^%$#@! name";
	  
	  s=s.replaceAll("[^a-zA-Z0-1]", "");
	  
	  System.out.println(s);
   }
}
