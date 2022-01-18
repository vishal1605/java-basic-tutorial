package com.java.constructor;

public class PrivateConstructorAndSingleton {
	static PrivateConstructorAndSingleton instance=null;
	public int x = 10;
	
	PrivateConstructorAndSingleton() {
		System.out.println("Private Constroutor");
	}
	
	static public PrivateConstructorAndSingleton getInstance()
    {
        if (instance == null)  {      
             instance = new PrivateConstructorAndSingleton();
        }
   
        return instance;
    } 
	
	public static void main(String[] args) {
		PrivateConstructorAndSingleton p = PrivateConstructorAndSingleton.getInstance();
		PrivateConstructorAndSingleton a = PrivateConstructorAndSingleton.getInstance();
		p.x=12;
		a.x=13;
		System.out.println(p.x);
		System.out.println(a.x);

	}

}
