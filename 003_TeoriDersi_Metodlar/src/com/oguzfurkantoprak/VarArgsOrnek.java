package com.oguzfurkantoprak;

public class VarArgsOrnek {

	
	public static void toplaVarArgs(int...sayilar) { // 3 boşluk var!!
		//https://www.baeldung.com/java-varargs
		int toplam=0;
		//sayılar dizi ggibi davranır.
		for(int i=0;i<sayilar.length;i++) {
			toplam+=sayilar[i];
		}
		System.out.println(toplam);
	}
	
	
	
	public static void main(String[] args) {
		
		toplaVarArgs(1, 2, 3, 4);

	}

}
