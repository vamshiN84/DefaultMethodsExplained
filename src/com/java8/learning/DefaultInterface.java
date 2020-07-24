package com.java8.learning;
@FunctionalInterface
public interface DefaultInterface   {
	//Single abstract method
	void doSomething(String str) ;
	public default void  doStuff() {
		System.out.println("learning Functional Intefaces");
	}
}
