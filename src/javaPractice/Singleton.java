package javaPractice;

public class Singleton {

	
	private static Singleton abc; // to only create one instance of a class
	
	private Singleton() {	
		//To hinder other classes from creating an object of this class
	}
	
 public static Singleton getInstance() {
	 
	 if(abc == null) {
		 
		 abc = new Singleton();
	 }
	 
	 return abc;
	 
 }
 }

