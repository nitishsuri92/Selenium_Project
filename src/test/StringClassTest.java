package test;

public class StringClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fname = "Savan";
		System.out.println("My name is "+fname);
		
		String lname = "Patel";
		System.out.println("My full name is "+ fname + lname);
		
		int a = 100;
		int b = 10;
		
		System.out.println(fname+lname+a+b);
		System.out.println(a+b+fname+lname);
		System.out.println(fname+lname+(a+b ));
		
		System.out.println(fname.indexOf('l'));
	}

}