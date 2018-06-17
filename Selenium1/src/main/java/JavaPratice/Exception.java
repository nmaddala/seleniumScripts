package JavaPratice;

import org.testng.annotations.Test;

public class Exception 
{
	@Test
	public static void exce()
	{
	
			m1(10);
			m1(20);
			m1(30);
			

	}
	
	public static void m1(int a)
	{
		try
		{

			if(a==10)
				throw new ArrayIndexOutOfBoundsException();
			if(a==20)
				throw new NullPointerException();
			if(a==30)
				throw new ClassCastException();
			
		}
			
		catch(ClassCastException e)
		{
			System.out.println(e);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e);
		}	
	}
	
}
