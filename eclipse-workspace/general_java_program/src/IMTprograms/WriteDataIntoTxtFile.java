package IMTprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTxtFile 

{
   public static void main(String args[]) throws IOException
   {
	 FileWriter fw=new FileWriter("/Users/mohanakv/Desktop/mo.txt"); 
	 BufferedWriter bw=new BufferedWriter(fw);
	   
	   bw.write("moving toward");
	   bw.write("to achieve success");
	   
	   System.out.println("DONE");
	   System.out.println(bw.getClass());
	   bw.close();
	   
   }
}
