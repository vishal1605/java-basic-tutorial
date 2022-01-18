package com.java.thread;


class Test extends Thread{
	
	public void run(){
		
			System.out.println("Test start");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Test has been completed");
		
	}
	
}

class DocumentsVary extends Thread{
	
	public void run(){
		
			System.out.println("DocumentVary start");
			
			System.out.println("DocumentVary has been completed");
		
	}
	
}

class TestDriver extends Thread{
	public void run(){
		
			System.out.println("TestDrive start");
			
			System.out.println("TestDrive has been completed");
		
	}
}
public class ThreadJoinEx3 {

	public static void main(String[] args) throws InterruptedException {
		Test t= new Test();
		t.start();
		t.join();
		
		DocumentsVary dv = new DocumentsVary();
		dv.start();
		dv.join();
		
		TestDriver td = new TestDriver();
		td.start();
		td.join();
		

	}

}
