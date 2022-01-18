package com.java.array;

public class ArrayIntro {

	public static void main(String[] args) {
//		int[] num = new int[20];
//		num[0]=01;
//		num[4]=4;
//		num[6]=6;
//		num[10]=10;
//		num[12]=12;
//		num[16]=16;
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}
		int id = 3;
		String name = "vishal";
		String address = "Kalyan";
		Company c = new Company();
		c.setId(id);
		c.setName(name);
		c.setAddress(address);
		
		Company[] c1 = {c};
		
		for(Company c2 :c1) {
			System.out.println(c2);
		}
		
//		for(int i: num) {
//			System.out.println(i);
//		}
//		
//		int[] value = {2,4,6,8,10,12};
		

	}

}
