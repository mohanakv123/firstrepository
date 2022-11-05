package IMTprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingDataFromFile 
{

	public static void main(String[] args) throws IOException
	{
	/*FileReader fr=new FileReader("/Users/mohanakv/Desktop/mo.txt" );
	BufferedReader br=new BufferedReader(fr);
	String Str;
	
	while((Str=br.readLine())!=null)
	{
		System.out.println(Str);
	}*/
		
		//2)Approach
		
		/*File file=new File("/Users/mohanakv/Desktop/mo.txt");
		Scanner sc=new Scanner(file);
		
		
	
		while( sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}*/
		
		
		//3)Approach
  
		File file=new File("/Users/mohanakv/Desktop/mo.txt");
		Scanner sc=new Scanner(file);
		
		sc.useDelimiter("\\a");
		
		System.out.println(sc.next());
		
	}

}
