package com.salman.strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class StringConcatenationPerformance {

	StringBuilder sb = new StringBuilder();
	StringBuffer sbuf = new StringBuffer();
	String s = ""; 
	
	public StringConcatenationPerformance() {
		System.out.println("\n\nString Performance Starts Here...");
	}
	public void concatPerformancePlus() {
		 LocalTime myObj = LocalTime.now(); // Create a time object

		 String time1 = myObj.toString(); 
		 SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		 Date date1 = null;
		try {
			date1 = format.parse(time1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		    System.out.println("Plus");
		    System.out.println(myObj); // Display the current time
		    for(int i = 0; i<100; i++) {
		    	s+="+ Operator"; 
		    }
		    LocalTime myObjOut = LocalTime.now();
		    System.out.println(myObjOut); // Display the current time
		    
		    String time2 = myObjOut.toString();
		    Date date2 = null;
			try {
				date2 = format.parse(time2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			double difference = date2.getTime() - date1.getTime();
			 Double d = (Double)difference; 
			 System.out.println("\nTime Elasped is " + d +"\n");

	}

	public void concatPerformanceSBuff() {
		 LocalTime myObj = LocalTime.now(); // Create a time object
		 
		 String time1 = myObj.toString();
		 
		 SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		 Date date1 = null;
		try {
			date1 = format.parse(time1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  
		 
		 System.out.println("Buffer");
		    System.out.println(myObj); // Display the current time
		    for(int i = 0; i<100000; i++) {
		    	sbuf.append("+ Operator"); 
		    }
		    
		    LocalTime myObjOut = LocalTime.now();
		    System.out.println(myObjOut); // Display the current time
		    
		    String time2 = myObjOut.toString();
		    Date date2 = null;
			try {
				date2 = format.parse(time2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			double difference = date2.getTime() - date1.getTime();
			 Double d = (Double)difference; 
			 System.out.println("\nTime Elasped is " + d.doubleValue() + 1e-10 +"\n");
	}

	public void concatPerformanceSBuild() {
		 LocalTime myObj = LocalTime.now(); // Create a time object

		 String time1 = myObj.toString(); 
		 SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		 Date date1 = null;
		try {
			date1 = format.parse(time1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 

		 
		 System.out.println("Builder");
		    System.out.println(myObj); // Display the current time
		    for(int i = 0; i<100000; i++) {
		    	sb.append("+ Operator"); 
		    }
		    LocalTime myObjOut = LocalTime.now();
		    System.out.println(myObjOut); // Display the current time

		    String time2 = myObjOut.toString();
		    Date date2 = null;
			try {
				date2 = format.parse(time2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 double difference = date2.getTime() - date1.getTime();
			 Double d = (Double)difference; 
			 System.out.println("\nTime Elasped is " + d.doubleValue() + 1e-10 +"\n");

	}

	
}
