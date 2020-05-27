package com.problem.string;

import java.util.HashSet;

public class NonRepeatingChar {
	
	public static Character firstChar(String str) {
		
		char[] charArray= str.toCharArray();
		
		HashSet<Character> set= new HashSet<>();
		
		for(Character c: charArray) {
			if(set.contains(c)) {
				return c;
			}else {
				set.add(c);
			}
		}
		
		return '\0';
	}
	
	public static void main(String[] args) {
		//firstChar("AliaBahtt");
		
		System.out.println(firstChar("geeksforgeeks"));
		
		//char 
	}

}
