package com.java.collection;
import java.util.*;

public class ListInterface {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(0, 3);
		list.add(1, 1);
		list.add(2, 5);
		list.add(3, 4);
		System.out.println(list);
		System.out.println("===================");
		
		List<Integer> list1 = new ArrayList<>(10); //declaring with size
		list1.add(8);
		list1.add(2);
		list1.add(9);
		
		list.addAll(list1);
		
		System.out.println(list);
//		System.out.println(list.get(5));
		
		System.out.println("===================");
		list.remove(6);
		System.out.println(list);
		
		System.out.println("===================");
		Iterator<Integer> iterator = list.iterator();
		
		
		list.set(0, 10);
		
		System.out.println(list);
		
		//iterating output
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===================");
		
		for(int i:list) {
			System.out.println(i);
		}
		
		System.out.println("===================Sort");
		
//		while(iterator.hasNext()) {
//			Integer next = iterator.next();
//			System.out.println(next+"itr");
//		}
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
