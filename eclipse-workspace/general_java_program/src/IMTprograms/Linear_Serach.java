package IMTprograms;

public class Linear_Serach {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6,7};
		int serch=9;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(serch==a[i])
			{
				System.out.println("Serach element found at:"+i);
				flag=true;
			}
		}
        if(flag==false)
        {
        	System.out.println("Serach element not found");
        }
	}

}
