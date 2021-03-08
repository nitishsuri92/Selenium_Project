package test;

public class ForloopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i<= 100; i++)
		{
			System.out.println(i);
			if(i == 50)
			{
				break;
			}
		}
		System.out.println("after for loop");
		
		
	}
}
