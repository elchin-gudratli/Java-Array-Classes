package com.bilgeadam.array;

public class CokBouyutluDiziOrnek2 {
	
	public static void main(String[] args) {
		String [] [] bilgeadamYazarlari=
			{
					{"Ibrahim","Gokyar","Erkek","Bilgi Islem"},
					{"Mehmet","Yilmaz","Erkek","Muhasebe"},
					{"Aycan","Ayhan","Erkek","Arge"},
					{"Enes","Ates","Erkek","Insan Kaynaklari"},
					{"Eren","Basaran","Erkek","Cay Ocagi"}
			};
		stringArrayPrinter(bilgeadamYazarlari);
	}

	public static void stringArrayPrinter(String[][]strArray) {
		int rowSize=strArray.length;
		//Satirlari yazdirir
		for(int row=0; row<rowSize; row++) {
			int columnSize=strArray[row].length;
			//columnlari yazdirir 
			for(int column=0; column<columnSize; column++) {
				System.out.print(strArray[row][column] +" ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		
	}

}
