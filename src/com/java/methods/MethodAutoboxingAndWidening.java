package com.java.methods;

public class MethodAutoboxingAndWidening {

	public static void main(String[] args) {
		MethodAutoboxingAndWidening mav = new MethodAutoboxingAndWidening();
//		mav.method(5);
		mav.method(new Integer(455));
		mav.method(new Long(551654551));
//		mav.value(5);
//		mav.value(10.256f);

	}

	public void method(int i)
    {
          
        System.out.println("Primitive type int formal argument :" + i);
    
    }
    // overloaded method with reference formal argument
    public void method(Integer i)
    {
          
        System.out.println("Reference type Integer formal argument :" + i);
    }
//      
//    // 2. overloaded method primitive formal argument
//    // and to be invoked for wrapper Object as overloaded method
//    // with wrapper object of same(Long) type as an argument is not 
//    // available.
    public void method(long i)
    {
          
        System.out.println("Primitive type long formal argument :" + i);
    }

//	public void value(int i) {
//		System.out.println("Hello Int");
//
//	}
//
//	public void value(float i) {
//		System.out.println("Hello Float");
//
//	}

}
