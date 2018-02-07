package com.devendra.sample;


class Parent{
	static void Check(){
		System.out.println("Parent");
	}
}

public class Child extends Parent {
	
	static void test(){
		System.out.println("Child");
	}
	
	
	public static void main(String[] args) {
		Parent p=new Child();
		p.test();   // ---> Create method 'test()'  in type Parent
		            // ---> Add cast to 'p'
	}

}
