package com.java.methods;

public class MethodAndNull {
	
	 public void fun(Integer i)
	    {
	        System.out.println("fun(Integer ) ");
	    }
	    public void fun(String name)
	    {
	        System.out.println("fun(String ) ");
	    }

	public static void main(String[] args) {
		MethodAndNull ma = new MethodAndNull();
//		ma.fun(1);
		Integer arg = null;
		String arg1 = null;
		ma.fun(1);

	}

}
