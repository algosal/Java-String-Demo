package com.salman.strings;

public class StringsDemo {

	public static void main(String[] args) {
		// using the String Class Constructor
		String sObj = new String("String Object from new Keyword");
		
		//using an Array
		char[] cArray = {'S', 'a', 'l', 'm', 'a', 'n'};
		String sArray = new String(cArray);  
		
		//using String Literal -- recommended way -- Always use Double quotes
		String s = "My name is a String 1";
		
		
		
		System.out.println(sObj);
		System.out.println(sArray);
		System.out.println(s);
		
		
	/*	System.out.println("\n\n\t\t Our String Class Examples of Methods Start here... ");
		
		StringMethodEg sMethods = new StringMethodEg();
		Class<? extends StringMethodEg> sReflection = sMethods.getClass();
		System.out.println(sReflection);
	*/	
		StringMethodEg.stringExamples();
		
		
	/*	 LiteralVNew lVN = new LiteralVNew();
		 lVN.stringPoolTest();
*/
		 StringConcatenation sC = new StringConcatenation(); 
		 
		 StringConcatenationPerformance sCP = new StringConcatenationPerformance();
		 sCP.concatPerformancePlus();
		 sCP.concatPerformanceSBuff();
		 sCP.concatPerformanceSBuild();
		 
		 
		 
		 System.out.println("The Changes will be Commited and Pushed\n\n");
		 
		 SalmanStringForGIT salGITStrings = new SalmanStringForGIT();
		 salGITStrings.myStringFunc();
	


		

	}

}
