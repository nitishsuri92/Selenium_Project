package test;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10,j = 20;
		System.out.println("i :"+i);
		
		i=20;
		System.out.println("i: "+i);
		
		i = i + 10;
		System.out.println("i: "+i);
		
		i = i*2;
		System.out.println("i: "+i);
		
		System.out.println("i: "+i++);
		System.out.println("i: "+ ++i + ", j: "+j);
		
		char a = 'b';
		System.out.println("a ->"+a);
		
		double c = 10.5;
		System.out.println("c-> "+c);
		
	}

}
