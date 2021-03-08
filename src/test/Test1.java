package test;

import selenium.Test4;

public class Test1 {

	public static Test1 t1 = new Test1();
	public static Test2 t2 = new Test2();
	public static Test3 t3 = new Test3();
	public static Test4 t4 = new Test4();

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("I am in main method");
	  
	  System.out.println("");

	 
	  printMe();
	  scanMe();
	  t1.testme();
	  Test2.red();
	  t2.blue();
	  Test3.circle();
	  t3.square();
	  Test4.car();
	  t4.truck();
	}	
	public static void scanMe()
	{
		System.out.println("scan me method");
	}
		public static void printMe()
		{
			System.out.println("print me method");
		}
		
		public void testme()
		{
			System.out.println("test me method ");
		}
		
	

}
