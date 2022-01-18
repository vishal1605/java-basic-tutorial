package com.java.methods;

public class FillingTraceMethod {

	public static void main(String[] args) throws Throwable{
		FillingTraceMethod ftm = new FillingTraceMethod();
		try {
		ftm.divide();
		}catch(ArithmeticException e) {
			System.out.println("Exception details without fillInStackTrace()\n");
            System.err.println("Caught Inside Main:");
            e.printStackTrace();
  
            // Exception details using fillInStackTrace()
  
            System.out.println("Exception details with fillInStackTrace()\n");
            System.err.println("Caught Inside Main:");
            e.fillInStackTrace();
            e.printStackTrace();
		}

	}
	
	public void divide(){
		try {
		System.out.println(100/0);
		}catch(ArithmeticException e) {
			throw e;
		}
	}

}
