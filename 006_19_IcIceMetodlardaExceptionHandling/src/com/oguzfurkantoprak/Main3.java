package com.oguzfurkantoprak;

public class Main3 {

	
	//bir üye metod yazalım
	public void function3() {
			int x = 20 / 0 ;
		System.out.println("function3 sonu...");
		
	}
	
	public void function2() {
		try {
			function3();
		} catch (Exception e) {			
		}
		System.out.println("function2 sonu...");
		
	}
	
	public void function1() {
		function2();
		System.out.println("function1 sonu...");
		
	}
	
	
	public static void main(String[] args) {
		
		Main3 main = new Main3(); // static olmayan üye metodları çağırabilmek için nesne oluşturduk
		main.function1();

//		function2 sonu...
//		function1 sonu...
		//şeklinde yazdırır.
	}

}
