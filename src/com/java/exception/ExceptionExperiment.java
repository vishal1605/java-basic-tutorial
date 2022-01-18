package com.java.exception;

public class ExceptionExperiment {

	public static void main(String[] args) {
		ExceptionExperiment e = new ExceptionExperiment();

		e.divide();

		System.out.println("1");
		System.out.println("2");

	}

	public void divide() {
		try {

			System.out.println(20 / 0);
		} catch (Exception e1) {
			System.out.println(e1);
		}

	}

}
