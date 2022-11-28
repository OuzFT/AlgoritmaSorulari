package com.oguzfurkantoprak;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>(); // içinde synchronized metodlar bulunur, Vector gibi threadlerle kullanılabilir.
		
		//Stack'e son giren ilk çıkar. LIFO (Last In First Out)
		stack.add("Kedi");
		stack.add("Köpek");
		stack.add("Aslan");
		stack.add("Kuş");
		
		for (String s : stack) {
			System.out.println(s);
		}
		//
		//Stack'e son giren elemanı getir metodu: peek()
		System.out.println();
		System.out.println(stack.peek());
		
		//Stack'e son giren elemanı çıkar metodu: pop()
		System.out.println();
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack.pop());
		
		//Stack boş mu kontrol metodu: isEmpty()
		System.out.println("Stack boş mu? " + stack.isEmpty());
		stack.pop();
		stack.pop();
		System.out.println("Stack boş mu? " + stack.isEmpty());
		//parantez kontrolünde stack kullanılır mesela
		
	}

}
