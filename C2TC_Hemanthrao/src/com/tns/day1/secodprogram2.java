package com.tns.day1;

public class secodprogram2 {

	    public static void main(String[] args) {
	    	
	    	int number = 10;
	        String result;

	        // Conditional statements (if-else)
	        System.out.println("Conditional Statement Example:");
	        if (number > 0) {
	            result = "The number is positive.";
	        } else if (number < 0) {
	            result = "The number is negative.";
	        } else {
	            result = "The number is zero.";
	        }
	        System.out.println(result);

	        // Switch statement
	        System.out.println("\nSwitch Statement Example:");
	        int dayOfWeek = 3; 
	        String dayName;
	        switch (dayOfWeek) {
	            case 1:
	                dayName = "Monday";
	                break;
	            case 2:
	                dayName = "Tuesday";
	                break;
	            case 3:
	                dayName = "Wednesday";
	                break;
	            case 4:
	                dayName = "Thursday";
	                break;
	            case 5:
	                dayName = "Friday";
	                break;
	            case 6:
	                dayName = "Saturday";
	                break;
	            case 7:
	                dayName = "Sunday";
	                break;
	            default:
	                dayName = "Invalid day";
	                break;
	        }
	        System.out.println("Day of the week: " + dayName);

	        // Loop control statements (break, continue)
	        System.out.println("\nLoop Control Statements Example:");
	        for (int i = 1; i <= 5; i++) {
	            if (i == 3) {
	                continue; 
	            }
	            System.out.println("Value: " + i);
	            if (i == 4) {
	                break; 
	            }
	        }	       	       
	     // for loop
	        System.out.println("For Loop Example:");
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Iteration: " + i);
	        }

	        //  while loop
	        System.out.println("\nWhile Loop Example:");
	        int j = 1;
	        while (j <= 5) {
	            System.out.println("Iteration: " + j);
	            j++;
	        }

	        //do-while loop
	        System.out.println("\nDo-While Loop Example:");
	        int k = 1;
	        do {
	            System.out.println("Iteration: " + k);
	            k++;
	        } while (k <= 5);

	        // nested loop
	        System.out.println("\nNested Loop Example:");
	        for (int outer = 1; outer <= 3; outer++) {                                                                                                                                                                                                                                 
	                System.out.print("(" + outer + "," + inner + ") ");
	            }
	            System.out.println(); 
	        }
	    }
	}

