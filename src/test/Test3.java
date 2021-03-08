package test;

public class Test3 {
	
public static Test3 t3 = new Test3();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.out.println("");
		//call scanMe
	    
		Test1.scanMe();
		System.out.println("");
		//call testMe
		Test1.t1.testme();
		
		System.out.println("");
		//call circle
		circle();
		
		System.out.println("");
		//call square
		t3.square();
	}
	// class them in Test1 and Test3
	//static - circle
	public static void circle()
	{
		System.out.println("call the circle");
	}
	
	//non-static -square
	public void square()
	{
		System.out.println("call the square");
	}
	
	public Test3() {
		System.out.println("I am another constructor");
	}

	
}
