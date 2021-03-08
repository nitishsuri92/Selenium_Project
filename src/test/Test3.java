package test;

public class Test3 {

	static Test1 t1 = new Test1();
	static Test3 t3 = new Test3();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t1.testMe();
		
		circle();
		t3.square();
	}

	public static void circle() {
		System.out.println("circle method");
	}
	
	public void square() {
		System.out.println("square method");
	}
}
