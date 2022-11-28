package com.oguzfurkantoprak;

public class Main4 {

	
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
		try {
			function2();
		} catch (Exception e) {
		}		
		System.out.println("function1 sonu...");
		
	}
	
	
	public static void main(String[] args) {
		
		Main4 main = new Main4(); // static olmayan üye metodları çağırabilmek için nesne oluşturduk
		main.function1();

//		function1 sonu...
		//şeklinde yazdırır.
	}

}
