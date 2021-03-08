package test;

public class ReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printme();
System.out.println(hello());
String a = hello();
System.out.println(a);
System.out.println(sum());

	}
	
	public static void printme()
	{
		System.out.println("printme");
	}
	
	public static String hello()
	{
		String name= "Dharmil";
		return name;
	}
	
	public static int sum()
	{
		int p = 4+5;
		return p;
	}
	

}
