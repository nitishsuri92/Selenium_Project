package test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Classname objname = new Classname();
		
		ArrayList<String> tools = new ArrayList<String>();
		
		tools.add("Selenium");
		tools.add("Postmane");
		tools.add("JIRA");
		
		System.out.println(tools);
		System.out.println(tools.size());
		System.out.println(tools.get(0));
		 
		tools.remove(1);
		System.out.println(tools);
		
		for (int i=0; i< tools.size(); i++)
		{
			System.out.println("For -> "+tools.get(i));
		}
		
		//for each
		for(String s : tools) {
			System.out.println("For Each -> "+s);
		}
	}

}
