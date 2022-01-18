package com.java.methods;

public class ReturnMultipleValueMethod {
	
//	int mul;
//	double div;
//	int add;
//	
//	ReturnMultipleValueMethod(int m, double d, int a){
//		mul=m;
//		div = d;
//		add = a;
//		
//	}
//	static ReturnMultipleValueMethod getMultDivAdd(int a, int b)
//    {
//        return new ReturnMultipleValueMethod(a * b, (double)a / b, (a + b));
//    }
	
	public static void main(String[] args) {
//		ReturnMultipleValueMethod rm = getMultDivAdd(5,3);
//		System.out.println(rm.add);
		ReturnMultipleValueMethod rm = null;
		rm.nonStaticMethod();

	}
	
	private static void staticMethod()
    {
        //Can be called by null reference
        System.out.println("static method, can be called by null reference");
          
    }
          
    private void nonStaticMethod()
    {
        //Can not be called by null reference
        System.out.print(" Non-static method- ");
        System.out.println("cannot be called by null reference");
          
    }

}
