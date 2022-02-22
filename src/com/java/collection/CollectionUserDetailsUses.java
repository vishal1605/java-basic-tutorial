package com.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionUserDetailsUses {
	
	static List<UserDetails> list;
	
	public static long setUsers(UserDetails user) {
		list = new ArrayList<UserDetails>();
		list.add(user);
		return user.getuId();
	}
	
	public static List<UserDetails> setListUsers(List<UserDetails> user) {
		list = new ArrayList<UserDetails>();
		list.addAll(user);
		return list;
	}
	
	
	public static UserDetails getSingleUser(List<UserDetails> list) {
		String name = "Vishal";
		UserDetails user = new UserDetails();
		user.setName(name);
		int i = list.indexOf(user);
		UserDetails details = list.get(i);
		
		return details;
	}

	public static void main(String[] args) {
		
		UserDetails vishal = new UserDetails(1, "Vishal", "Vishalgptt@gmail.com", "kalyan", "B.E.");
		UserDetails sahil = new UserDetails(2, "Sahil", "Sahil777@gmail.com", "titwala", "B.S.C.");
		UserDetails ravi = new UserDetails(3, "Ravi", "Ravi222@gmail.com", "Dombivali", "B.Com");
		UserDetails nitesh = new UserDetails(4, "Nitesh", "Nitesh911@gmail.com", "Bostan", "M.S.");
		List<UserDetails> list = new ArrayList<>();
		list.add(nitesh);
		list.add(ravi);
		list.add(sahil);
		list.add(vishal);
		List<UserDetails> list2 = setListUsers(list);
		
		
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		for(UserDetails user :list2) {
			if(name.equalsIgnoreCase(user.getName())) {
				System.out.println(user);
			}else {
				System.out.println("Not matched");
			}
		}
		
		
		
		
		

	}

}
