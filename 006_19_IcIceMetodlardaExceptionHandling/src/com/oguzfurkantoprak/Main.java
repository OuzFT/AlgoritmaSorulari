package com.oguzfurkantoprak;

public class Main {

	
	//bir üye metod yazalım
	public void function3() {
		
		try {
			int x = 20 / 0 ;
		} catch (Exception e) {
		}
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
		
		Main main = new Main(); // static olmayan üye metodları çağırabilmek için nesne oluşturduk
		main.function1();

//		function3 sonu...
//		function2 sonu...
//		function1 sonu...
		//şeklinde yazdırır.
	}

}
