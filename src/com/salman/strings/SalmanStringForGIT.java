package com.salman.strings;

public class SalmanStringForGIT {
	
	private String[] s = new String[2];
	private String sL = "Salman has the private String";
	
	private int [] a = new int[5];
	
	{		
		s[0] =	"This is the GIT Class";
		s[1] = "This is also an Array test";
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
	}
	
	
	public void myStringFunc() {
		System.out.println("I am Calling my Strings " + 
	s[0] + " and " + s[1] + " are Arrays and String literal is " + sL);
	
		
		int i = 0; 
	for(int o : a) {
		System.out.println("values at index " + i + " are " + o);
		i++; 
	}
	
		System.out.println("This is to test the pull from sub branch");
	}
	
}
