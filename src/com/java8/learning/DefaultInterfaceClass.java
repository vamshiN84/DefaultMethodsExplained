package com.java8.learning;

public class DefaultInterfaceClass {
public static void main(String[] args) {
	DefaultInterface lambda = s->System.out.println(s.charAt(0));
	lambda.doSomething("string");
}
}
