package com.java.exception;

public class ExceptionExperiment2 {

	public static void main(String[] args) {
		 int[] arr = new int[4];
	        try
	        {
	            int i = arr[4];
	                 
	            System.out.println("Inside try block");
	               
	        }catch(Exception ex)
	        {
	            System.out.println("Exception has been caught");
	        }
	         
	        
	        System.out.println("Outside try-catch clause");

	}

}
