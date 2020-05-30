package com.problem.streams;

public class FuncInterfaceEx {
	public static void main(String[] args) {
		Interf i = n -> n*n;
		System.out.println(i.square(10));
	}
	
	//predicate --> boolean test(T t)
	//Function --> R apply(T t)
	//Consumer --> void accept(T t)
	//Supplier --> R get()
	//local variable referenced from lambda exp must be final
	//IntPredicate,LongPredicate, DoublePredicate
	

}
