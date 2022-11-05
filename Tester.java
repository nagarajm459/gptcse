import java.util.*;
import java.time.*;
class Base
{
	public void method(int a)
	{
			System.out.println("Base Method");
	}
}
	class Derived extends Base
	{
			public void method()
			{
				System.out.println("Derived");
			}
	}
		
		
class Tester
{
	
	
	
	public static void main(String[] args)
	{
		Set <String> s = new TreeSet<String> ();
		s.add("Infosys");
		s.add("Google");
		s.add("IBM");
		for ( String e:s)
		{
			System.out.println(" " +e);
			s.clear();
		}
		
			
		
		
	}
	
		
		
}
