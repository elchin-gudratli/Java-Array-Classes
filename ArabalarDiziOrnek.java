package com.bilgeadam.array;

import com.bilgeadam.abstracts2.Araba1;
import com.bilgeadam.abstracts2.BMW1;
import com.bilgeadam.abstracts2.Mercedes1;
import com.bilgeadam.abstracts2.Porche1;

public class ArabalarDiziOrnek {

	public static void main(String[] args) {
		BMW1   b=new BMW1();
		b.Marka="BMW";
		b.Model="X5";
		b.Renk="Qara";
		
		Mercedes1  m=new Mercedes1();
		m.Marka="Mercedes";
		m.Model="G63";
		m.Renk="Ag";
		
		Porche1    p=new Porche1();
		p.Marka="Porche";
		p.Model="Cayenne S";
		p.Renk="Boz";
		
		Araba1 [] arabalar= {b,m,p};
		
		int toplam=0;
		for(int i=0; i<arabalar.length; i++) {
			System.out.println("Markasi: "+arabalar[i].Marka
					+" Modeli: "+arabalar[i].Model+" Rengi: "+arabalar[i].Renk
					+" Kac Litre Yakiyor: "+arabalar[i].Yakitnekadar());
			toplam=toplam+arabalar[i].Yakitnekadar();
		}
		
		System.out.println("Toplam Litre: "+toplam);
		

	}

}
