package com.java.wrapper_class;

public class WrapperClassStarts {

	public static void main(String[] args) {
		Float floatWrap = Float.valueOf(45.158f);
		Integer i = Integer.valueOf("12");
		Integer j = Integer.valueOf(12);
		
		Boolean boolean1 = Boolean.valueOf(false);
		Boolean boolean2 = Boolean.valueOf("false");
		 
        
        int floatToInt = floatWrap.intValue();
 
        // Print the non-primitive(Integer) value
        System.out.println(floatToInt);
 
 
        // Convert the binary number to the integer value
       Integer of = Integer.valueOf("1010", 2);
       Integer value = Integer.parseInt(Integer.toBinaryString(15));
 
        // Print the number
        System.out.println(boolean2);
        System.out.println(value);

	}

}
