package com.salman.strings;

public class LiteralVNew {
	String s1 = "hello"; //literals
	String s2 = "hello";
	
	String s3 = new String("hello");
	String s4 = new String("hello"); 
	
	String s5 = "lo"; //could use final for true

	
	public void stringPoolTest() {
		
		System.out.println("\nInside String Pool...");
		
		//remember equals compares the contents 
//		System.out.println(s1.equals(s2));
//		System.out.println(s2.equals(s3));
//		System.out.println(s3.equals(s4));
//		

		//to prove that they are different Objects as the are different references
//		System.out.println(s1 == s2);
//		System.out.println(s2 == s3);
//		System.out.println(s3 == s4);
		

	      System.out.println("s1 == s2: " + (s1 == s2));
	      System.out.println("s2 == s3: " + (s2 == s3));
	      System.out.println("s3 == s4: " + (s3 == s4));
	      //intern really throws the outside object into the pool
	      System.out.println("s1 == s4.intern(): " + (s1 == s4.intern()));
      //literals are known at compile time as "+" concatenation is known at compile time
	      System.out.println("s1 == \"hel\" + \"lo!\": " + (s1 == "hel" + "lo")); 
	      //variables are evaluated at runtime, so it would give the false
	      System.out.println("s1 == \"hel\" + s5: " + (s1 == "hel" + s5));
//	      s5 = s5.intern(); 
//	      System.out.println("s1 == \"hel\" + s5 after intern(): " + (s1 == "hel" + s5));

	}
	
		
}
