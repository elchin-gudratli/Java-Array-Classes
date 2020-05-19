package com.bilgeadam.array;

import com.bilgeadam.abstracts.Calisan;
import com.bilgeadam.abstracts.GenelMudur;
import com.bilgeadam.abstracts.Mudur;
import com.bilgeadam.abstracts.Programci;
import com.bilgeadam.abstracts.Stajyer;

public class Calisanlar {

	public static void main(String[] args) {
		GenelMudur gm=new GenelMudur();
		gm.Ad="Hakan";
		gm.Soyad="Yilmaz";
		gm.Gorev="Genel Mudur";
		gm.YanGorev="Tesisci";
		
		Mudur   m=new Mudur();
		m.Ad="Mehmet";
		m.Soyad="Serkhan";
		m.Gorev="Mudur";
		
		Programci  p=new Programci();
		p.Ad="Serhat";
		p.Soyad="Sultan";
		p.Gorev="Programci";
		p.YanGorev="SMM MENECER";
		
		Stajyer    s=new Stajyer();
		s.Ad="Halit";
		s.Soyad="Ertunc";
		s.Gorev="Stajer";
		
		Calisan [] calisanlar= {gm,m,p,s};
		
		int toplam=0;
		for (int i=0; i<calisanlar.length; i++) {
			System.out.println("Adi : "
		            +calisanlar[i].Ad+" Soyadi : "
					+calisanlar[i].Soyad+" Gorevi : "
		            +calisanlar[i].Gorev+" YanGorevi: "+calisanlar[i].YanGorev+" Maasi : "
					+calisanlar[i].MaasiNedir());
			toplam=toplam+calisanlar[i].MaasiNedir();
		}
        System.out.println("Toplam Maas: "+toplam);
	}

}
