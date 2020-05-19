package com.bilgeadam.array;

public class ForeachOrnek3 {

	public static void main(String[] args) {
		
		String Calisanlar[]= {"Asli","Ahmet","Can","Sarp"};
		
		for(String c: Calisanlar) {
			System.out.println(c);
		}
        
		int Maas[]= {2000,3000,2500,3500};
		
		int toplam=0;
		
		for (int m: Maas) {
			
			toplam=toplam+m;
		
		}
		System.out.println("Toplam="+toplam);
		
		
		
	}

}
