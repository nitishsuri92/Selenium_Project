package test;

public class Argumentstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = sum();
		System.out.println(a);
		
		int b = sum(10,20);
		System.out.println(b);
	}

	public static int sum() {
		int p = 5+4;
		return p;
	}
	
	public static int sum(int s, int y) {
		int q = s + y;
		return q;
	}
	
	
}
