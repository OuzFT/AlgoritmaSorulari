package com.oguzfurkantoprak;

public class Main2 {

	
	//bir üye metod yazalım
	public void function3() {	
		int x = 20 / 0 ;
		System.out.println("function3 sonu...");
		
	}
	
	public void function2() {
		function3();
		System.out.println("function2 sonu...");
		
	}
	
	public void function1() {
		function2();
		System.out.println("function1 sonu...");
		
	}
	
	
	public static void main(String[] args) {
		
		Main2 main = new Main2(); // static olmayan üye metodları çağırabilmek için nesne oluşturduk
		main.function1(); // ArithmeticException hatası alırız...

	}

}
