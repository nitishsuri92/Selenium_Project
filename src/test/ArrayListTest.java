package test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ClassName objName = new ClassName();
		
		ArrayList<String> tools = new ArrayList<String>();
	tools.add("selenium");
	tools.add("jira");
	tools.add("testrail");
	tools.add("postman");
	System.out.println(tools);
	System.out.println("");
	System.out.println(tools.size());
	System.out.println("");
	System.out.println(tools.get(0));
	System.out.println(tools.get(1));
	System.out.println(tools.get(2));
	System.out.println(tools.get(3));
	
	tools.remove(1);
	System.out.println(tools.get(1));
	
	//for
	
	System.out.println("");
	for (int i = 0; i<tools.size(); i++)
	{
		System.out.println(tools.get(i));
	}
	
	
 //for each loop
	
	
	for(String s: tools)
	{
		System.out.println(s);
	}
}
}