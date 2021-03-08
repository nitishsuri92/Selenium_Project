package test;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tool = "Selenium";
		System.out.println(tool);
		
		String[] tools = {"Selenium", "QTP", "POSTMAN", "Jira", "Testlink"};
		System.out.println(tools[0]);
		
		for(int i = 0; i< tools.length; i++) {
			System.out.println("Loop: "+tools[i]);
		}
		
		int[] nums = new int[] {1,2,3,4,5,6};
		System.out.println(nums);
		System.out.println(nums[2]);
		
		Object[] general = {4, "Selenium", 'n'};
		System.out.println(general[2]);
	}

}