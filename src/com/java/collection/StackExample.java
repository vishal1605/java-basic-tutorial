package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(4);
		stack.push(1);
		stack.push(9);
		stack.push(5);
		stack.push(7);
		stack.push(3);
		
//		int i = stack.search(1);  //search method stack is use to search position of elements present in Stack
//		System.out.println(i);    // And its start count with one
		
		
		Integer pop = stack.pop(); // Stack pop method is used to remove the top element from the stack
		System.out.println(pop);
		
		Integer peek = stack.peek(); //Stack Peek method is use for get top element present in stack 
		System.out.println(peek);

	}

}
