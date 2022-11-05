package pattern;

public class ReverseString 
{
    public static void main(String args[]) 
      {
	String str="NAHOM";
	String rev="";
	int count=0;
	/*int length=str.length();
	for(int i=length-1;i>=0;i--) 
	{
    rev=rev+str.charAt(i);
	count++;

	}
	System.out.print(rev);
	System.out.println(" "+count);*/
	/*for (int i=0;i<=length-1;i++) 
	{
		System.out.println(i+" "+str.charAt(i));
		
	}*/
	//using character array
/*	char a[]=str.toCharArray();
	int l=a.length;
	for (int i=l-1;i>=0;i--)
	{
		rev=rev+a[i];
		
	}
	System.out.println(rev);*/
	//using string buffer class
	/*StringBuffer sb=new StringBuffer(str);
	StringBuffer s=sb.reverse();
	System.out.println(s);*/
	StringBuilder sbl=new StringBuilder(str);
	//sbl.append();
	
	System.out.println(sbl.reverse());
	
	
	
	
	

}
}
