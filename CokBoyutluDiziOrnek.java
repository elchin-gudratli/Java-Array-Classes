package com.bilgeadam.array;

public class CokBoyutluDiziOrnek {

	public static void main(String[] args) {


		String [] [] bilgeadam=new String[5] [4];
		bilgeadam[0] [0]="Ibrahim";
		bilgeadam[0] [1]="Gokyar";
		bilgeadam[0] [2]="Erkek";
		bilgeadam[0] [3]="Bilgi islem";
		bilgeadam[1] [0]="Mehmet";
		bilgeadam[1] [1]="Yilmaz";
		bilgeadam[1] [2]="Erkek";
		bilgeadam[1] [3]="Arge";
		bilgeadam[2] [0]="Aycan";
		bilgeadam[2] [1]="Ayhan";
		bilgeadam[2] [2]="Erkek";
		bilgeadam[2] [3]="Muhasebe";
		bilgeadam[3] [0]="Enes";
		bilgeadam[3] [1]="Ates";
		bilgeadam[3] [2]="Erkek";
		bilgeadam[3] [3]="Insan Kaynaklari";
		bilgeadam[4] [0]="Eren";
		bilgeadam[4] [1]="Basaran";
		bilgeadam[4] [2]="Erkek";
		bilgeadam[4] [3]="Cay Ocagi";
		
		stringArrayPrinter(bilgeadam);

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
