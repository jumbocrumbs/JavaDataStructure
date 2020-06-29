package com.problem.stack;

import java.util.Stack;

public class PostfixToInfix {
	
	public String convertToInfix(String exp){
		
		Stack<String> stack= new Stack<String>();
		
		
		for(int i=0; i < exp.length(); i++) {
			char c= exp.charAt(i);
			if(Character.isDigit(c) || Character.isAlphabetic(c)) {
				stack.push(c +"");
			}else {
				String val1= stack.peek();
				stack.pop();
				String val2= stack.peek();
				stack.pop();
				stack.push("(" + val2 + c + val1 + ")");
				
			}
		}
		return stack.peek();
		
	}
	
	public static void main(String[] args) {
		PostfixToInfix pi= new PostfixToInfix();
		//pi.convertToInfix("ab*c+");
		
		System.out.println(pi.convertToInfix("ab*c+"));
		
		
		
		
	}

}
