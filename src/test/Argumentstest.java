package test;

public class ArgumentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sum());
int e = sum(5,5);
System.out.println(e);
int g = sum(5,5,5);
System.out.println(g);

	}
	
	public static int sum()
	{
		int p = 4+5;
		return p;
	}
	public static int sum(int x, int y)
	{
		int w = x+y;
		return w;
	}
	public static int sum(int a , int b , int c)
	{
		int d = a+b+c;
		return d;
	}

}
