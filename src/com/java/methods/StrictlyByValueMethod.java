package com.java.methods;

public class StrictlyByValueMethod {
	
	int x;
	
//	public void change(int x) {
//		
//		x=10;
//		System.out.println(x);
//	}
	
	StrictlyByValueMethod(){
		x=0;
	}
	StrictlyByValueMethod(int i){
		x=i;
		
	}
	
	public static void change(StrictlyByValueMethod sv)
    {
//        sv = new StrictlyByValueMethod();
  
        sv.x = 10;
    }

	public static void main(String[] args) {
		StrictlyByValueMethod sv = new StrictlyByValueMethod(6);
		change(sv);
		System.out.println(sv.x);
		
		
		
		
//		int x = 4;
//		sv.change(x);
//		System.out.println(x);
		

	}

}
