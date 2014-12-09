package Satranc;

import java.util.Scanner;

public class Oyna {

	public static void main(String[] args) {
		
		
		boolean hata1=false;
		boolean hata2=false;
		Tahta tahta =new Tahta();
		Koordinat koordinat=new Koordinat();
		Oyuncu beyaz=new Oyuncu();
		Oyuncu siyah=new Oyuncu();
		
		
		while(true)
		{

			if(hata2!=true)  
			{

		    tahta.yazdir();
			System.out.println("Beyaz taþlý oyuncumuz sýra sizin,oynatmak istediðiniz taþýn X koordinatý?");
	    	koordinat.setbasX(new Scanner(System.in).nextByte());
	    	System.out.println("Y koordinatý lütfen ?"); koordinat.setbasY(new Scanner(System.in).nextByte());
	    	System.out.println("Götürmek istediðiniz x koordinatý?"); koordinat.setsonX(new Scanner(System.in).nextByte());
	    	System.out.println("Götürmek istediðiniz y koordinatý ?"); koordinat.setsonY(new Scanner(System.in).nextByte());
			
	    	if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='\0') 
	    		{ hata1=true;  System.out.println("Hatalý koordinat seçimi"); }
	    	
	    	if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]!='\0')
	    	  {
	    		hata1=false; beyaz.koordinatiAl(koordinat);     beyaz.tahtayiAl(tahta);       beyaz.tahtayaGonder();  
	    	  }
	    		
			} 
			

			 
			//Siyah için beyaz hata yapmamalý
			
	    	if(hata1!=true)
	    	{

				tahta.yazdir();
	    		System.out.println("Siyah taþlý oyuncumuz sýra sizin,oynatmak istediðiniz taþýn X koordinatý?");
		    	koordinat.setbasX(new Scanner(System.in).nextByte());
		    	System.out.println("Y koordinatý lütfen ?"); koordinat.setbasY(new Scanner(System.in).nextByte());
		    	System.out.println("Götürmek istediðiniz x koordinatý?"); koordinat.setsonX(new Scanner(System.in).nextByte());
		    	System.out.println("Götürmek istediðiniz y koordinatý ?"); koordinat.setsonY(new Scanner(System.in).nextByte());
	    	  	
	    		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='\0')
	    		     { hata2=true;   System.out.println("Hatalý koordinat"); }
	    		
	    		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]!='\0')
		    	  {
		    		hata2=false;   beyaz.koordinatiAl(koordinat);     beyaz.tahtayiAl(tahta);       beyaz.tahtayaGonder();   tahta.yazdir();
		    	  }
	 
	    		
	    	}
	    	
	    	
			
	    	 
		}
	
		
	}

}
