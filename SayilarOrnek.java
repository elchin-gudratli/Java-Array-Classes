package com.bilgeadam.array;

public class SayilarOrnek {
        // 2 ci yontem
	public static void main(String[] args) {
		
		int[] sayilar= {2,8,3,7,5,8,10,15,22,35};
		
		int toplam=0;
		
		for(int i=0; i<sayilar.length;i++) {
		
			System.out.println(sayilar[i]);
		    
			toplam=toplam+sayilar[i];
		    // toplam+=sayilar[i];
		}
		System.out.println("Toplam: "+toplam);
	}

}
