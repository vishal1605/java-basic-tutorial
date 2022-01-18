package com.java.thread;

public class ProducerAndConsumer {

	public static void main(String[] args) {
		Company c = new Company();
		Producer p = new Producer(c);
		p.start();
		
		Consumer c1 = new Consumer(c);
		c1.start();

	}

}
