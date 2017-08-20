package org.learning.java.func;

public class FuncInterfaceImpl {

	public static void main(String args[]){
		BasicFuncInterface funcInterface = () -> System.out.println("Hello! Suresh");
		funcInterface.helloWorld();
	}
}
