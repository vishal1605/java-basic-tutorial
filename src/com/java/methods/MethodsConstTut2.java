package com.java.methods;

public class MethodsConstTut2 {
	
	public static int  i= 0;
	MethodsConstTut2(){
		i++;
	}
	public static int get() 
    {
        return i;
    }
	public int m1()
    {
        System.out.println("Inside the method m1 by object of GFG class");
          
        // calling m2() method within the same class.
        this.m2();
          
        // statements to be executed if any
        return 1;
    }
	public void m2() 
    {
  
        System.out.println("In method m2 came from method m1");
    }
	

	public static void main(String[] args) {
		MethodsConstTut2 mc = new MethodsConstTut2();
		System.out.println(mc.get());
		System.out.println(mc.m1());
		
		System.out.println(i);

	}

}
