package com.bilgeadam.array;

public class ForeachOrnek {

	public static void main(String[] args) {
		
		int sayilar[]= {2,12,15,25,35};
		int toplam=0;
		for (int s: sayilar) {
			toplam=toplam+s;
			
			System.out.println("Toplam="+toplam);
		}
		

	}

}
