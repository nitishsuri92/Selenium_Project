package test;

import selenium.Test4;

public class Test1 {

	static Test1 t1 = new Test1();
	
	static Test2 t2 = new Test2();
	
	static Test3 t3 = new Test3();
	
	static Test4 t4 = new Test4();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I'am in main method");
		printMe();
		t1.testMe();
		t1.cleanMe();
		
		Test2.red();
		t2.blue();
		
		Test3.circle();
		t3.square();
		
		Test4.car();
		t4.truck();
	}
	
	public static void printMe() {
		System.out.println("print me method");
	}
	
	public void testMe() {
		System.out.println("test me method");
	}

	public void cleanMe( ) {
		System.out.println("clean me");
	}
	
}
