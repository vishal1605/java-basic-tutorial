package com.java.exception;

class MyException extends Exception
{

 
    // default constructor
    MyException() {    
    	
    }
 
    // parameterized constructor
    MyException(String str) {
    	super(str); 
    }
    }
