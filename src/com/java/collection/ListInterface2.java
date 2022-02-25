package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListInterface2 {

	public static void main(String[] args) {
//		List list = new ArrayList();  //Its is list without any specfic Object so can add any type of object
//		list.add("Vishal");
//		list.add(5);
//		list.add(true);
//		list.add(4.33);
//		list.forEach(cust-> System.out.print(cust+" "));

		List<Integer> comp = new ArrayList<>();
		comp.addAll(Arrays.asList(4, 5, 9, 3, 1, 7, 8, 6, 10));
		List<Integer> copy = new ArrayList<>();
		copy.addAll(comp);
		System.out.println(comp);
		int j = 0;
		int of = 0;
		for(int i=0;i<copy.size();i++) {
			if(j<copy.get(i)) {
				j=copy.get(i);
				of = copy.indexOf(j);
			
			}
		}
		System.out.println("First max number: "+j+" : "+of);
		
		copy.remove(of);
//		System.out.println(comp);
		int a= 0;
		for(int i=0;i<copy.size();i++) {
			if(a<copy.get(i)) {
				a=copy.get(i);
				j = a;
				of = copy.indexOf(j);
			
			}
			
		}
		System.out.println("Second max number: "+j+" : "+of);
		System.out.println(copy);
		

	}

}
