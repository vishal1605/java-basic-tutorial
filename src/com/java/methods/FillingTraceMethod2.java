package com.java.methods;

public class FillingTraceMethod2 {

	public static void main(String[] args) throws Throwable {
		
		FillingTraceMethod2 ft = new FillingTraceMethod2();
		ft.showResults();

	}
	
	public void showResults() throws Throwable
    {
        try {
            exceptionThrownMethod();
        }
        catch (Exception e) {
            e.printStackTrace();
            throw e.fillInStackTrace();
        }
    }
  
    // method throwing exception
    public void exceptionThrownMethod() throws Exception
    {
        
    	throw new Exception("this is thrown from function1()");
    }

}
