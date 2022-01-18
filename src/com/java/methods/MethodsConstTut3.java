package com.java.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsConstTut3 {
	static int[] getSumAndSub(int a, int b)
    {
        int[] ans = new int[2];
        ans[0] = a + b;
        ans[1] = a - b;
  
        // returning array of elements
        return ans;
    }
	
	public List<Object> getValue(){
		String name="Vishal";
		int age = 15;
		char gender = 'M';
//		List<Object> list = new ArrayList<Object>();
//		list.add(name);
//		list.add(age);
//		list.add(gender);
		return Arrays.asList(name, age, gender);
	}
	
	public List<String> getString(){
		
		return Arrays.asList("name", "age", "gender");
	}

	public static void main(String[] args) {
		MethodsConstTut3 mc3 = new MethodsConstTut3();
//		int[] ans=mc3.getSumAndSub(10, 2);
//		System.out.println(ans[1]);
		List<Object> value = mc3.getValue();
		System.out.println(value);

	}

}
