package com.oguzfurkantoprak;

public class Soru1 {

	
	public static void Sekil() {
		
		for (int i=0;i<3;i++) {
			for(int j=0;j<7;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		int yildiz=7;
		for (int i=0;i<7;i++) {
			for(int j=0;j<yildiz;j++) {
				System.out.print("* ");
			}
			System.out.println();
			yildiz--;
		}

	}
	
	
	public static void main(String[] args) {
		
		Sekil();


	}

}
