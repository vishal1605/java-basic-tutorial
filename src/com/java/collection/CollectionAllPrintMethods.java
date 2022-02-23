package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionAllPrintMethods {

	public static void main(String[] args) {

//		ArrayList<String> list = new ArrayList<>();
//		list.add("Vishal");
//		list.add("Sahil");
//		list.add("Nitesh");
//		list.add("Ravi");
//		System.out.println(Arrays.deepToString(list));

		List<Integer> list = Arrays.asList(3, 5, 4, 7, 9, 1, 2, 6, 10, 14, 11);
//		System.out.println(list);
//		for (int i = 0; i < list.size(); i++) {
//			
//			Integer value = list.get(i);
//			int j = list.indexOf(value);
//			System.out.println(value+" : "+j);
//
//		}
		
//		Iterator<Integer> i = list.iterator();
//		while(i.hasNext()) {     
//			int next = (int) i.next();
//			System.out.println(next+" : "+list.indexOf(next));
//		}
		
//		for(int i : list) {
//			System.out.println(i+" : "+list.indexOf(i));
//		}
		
//		list.forEach(i -> {
//			System.out.print(i+": ");
//			System.out.println(list.indexOf(i));
//		});
		
		
//		Iterrate List ib backward direction
		
		for(int i = list.size()-1; i>=0;i--) {
			System.out.println(list.get(i));
			
		}
	
	}

}
