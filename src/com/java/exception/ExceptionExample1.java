package com.java.exception;

public class ExceptionExample1 {
	
	private void m1()
    {
        m2();
        System.out.println("1");
    }
    private void m2()
    {
        m3();
        System.out.println("2");
    }
    private void m3()
    {
        System.out.println("3");
        try
        {
            int sum = 4/0;
            System.out.println("4");
        }
        catch(ArithmeticException e)
        {
            System.out.println("5");
        }
          
          
        System.out.println("7");
    }

	public static void main(String[] args) {
		ExceptionExample1 e = new ExceptionExample1();
		e.m1();
		

	}

}
