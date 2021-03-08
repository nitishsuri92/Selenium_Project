package test;

public class ConditionsTest {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub

		int a = 10;
		int b = 10;
		if (a==b)
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");

		}
		
		String p = "Selenium";
		String q = "selenium";
		
		if(p.equalsIgnoreCase(q))
		{
			System.out.println("both are not equal");
			
		}

		else
		{
			System.out.println("both are not equal");

		}

	}
}


