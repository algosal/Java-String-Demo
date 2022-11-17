package com.salman.strings;

public class StringConcatenation {
	String s = " Good " + "Morning "; 
	
	//StringBuffer sb = new StringBuffer(s); //Older Version Before Java 5 
	StringBuilder sb = new StringBuilder(s); //Newer Version
	
	public StringConcatenation() {
		System.out.println("\n\nString Concatenation Starts Here...");
		//Please Show the Compatibility of the two APIs 
		String myStringBuilderBuffer = sb.append("Salman ").append("Saeed").toString();
		System.out.println(myStringBuilderBuffer);
		System.out.println("I am being reversed:--> " + sb.reverse());
	}	
	
}
