package com.salman.strings;

public class StringMethodEg {

	static void stringExamples() {
		System.out.println("\nInside stringExamples ...");
		String s = "hello world!";
		System.out.println("s: " + s);
		
		System.out.println("\ns.length(): " + s.length()); 
		System.out.println("s.isEmpty(): " + s.isEmpty());
		
		// Comparison
	/*	System.out.println("\ns.equals(\"HELLO WORLD!\"): " + s.equals("HELLO WORLD!"));
		System.out.println("s.equalsIgnoreCase(\"HELLO WORLD!\"): " + s.equalsIgnoreCase("HELLO WORLD!"));
		System.out.println("s.compareTo(\"HELLO WORLD!\"): " + s.compareTo("HELLO WORLD!"));
	*/
		// Searching
	/*	System.out.println("\ns.contains(\"HELLO WORLD!\"): " + s.contains("HELLO WORLD!"));
		System.out.println("s.contains(\"world!\"): " + s.contains("world!"));
		System.out.println("s.startsWith(\"HELLO WORLD!\"): " + s.startsWith("HELLO WORLD!"));
		System.out.println("s.startsWith(\"hello world!\"): " + s.startsWith("hello world!"));
		System.out.println("s.endsWith(\"!\"): " + s.endsWith("!"));
		System.out.println("s.indexOf(\"lo\"): " + s.indexOf("lo"));
		System.out.println("s.indexOf(\"o\"): " + s.indexOf('o'));
		System.out.println("s.lastIndexOf(\"o\"): " + s.lastIndexOf('o'));
	*/
		// Examining individual characters
		//System.out.println("\ns.charAt(4): " + s.charAt(4));
		
		// Extracting substrings
//		System.out.println("\ns.substring(4): " + s.substring(4));
//		System.out.println("s.substring(4, 9): " + s.substring(4, 9)); //9 is exclusive
//		
		// Case conversions (Note: String is immutable. So, only a copy is returned)
//		System.out.println("\ns.toUpperCase(): " + s.toUpperCase());
//		System.out.println("s.toLowerCase(): " + s.toLowerCase());
		
	//	System.out.println("\ns.trim(): " + s.trim()); // returns a copy of string after trimming any leading & trailing white spaces
		
		
		// Replace (e.g., replace comma's with white-space)
		//System.out.println("\ns.replaceAll(\"white space \" and \",\"): " + s.replaceAll(" ", ",")); //typically used in .CSV files
		
		// Split (e.g., split a document into words or split a line of text by tab or comma or white space)
	/*	System.out.println("\ns.split(\"White Space\"): ");
		String[] sa = s.split(" ");
		for (String temp : sa) {
			System.out.println(temp);
		}
		*/
		// Static method (includes overloaded methods) 
//		System.out.println("\nString.valueOf(1.3): " + String.valueOf(1.30001)); //converting a double value into a String 
		
	}
	
}
