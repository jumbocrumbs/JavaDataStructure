package com.problem.string;

import java.util.HashMap;
import java.util.Map;

public class CharacterFreq {
	
	public static void getCharFreq(String str) {
		char[] charArray= str.toCharArray();
		
		Map<Character,Integer> map= new HashMap<>();
		for(Character ch: charArray) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
				
			}else {
				map.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			System.out.println("character " + entry.getKey() +" "+ entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		getCharFreq("shashishekhar");
		
	}

}
