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

		    tahta.yazdir(); System.out.println();
			System.out.println("Beyaz taþlý oyuncumuz sýra sizin,oynatmak istediðiniz taþýn X koordinatý?");
	    	koordinat.setbasX(new Scanner(System.in).nextByte());
	    	System.out.println("Y koordinatý lütfen ?"); koordinat.setbasY(new Scanner(System.in).nextByte());
	    	System.out.println("Götürmek istediðiniz x koordinatý?"); koordinat.setsonX(new Scanner(System.in).nextByte());
	    	System.out.println("Götürmek istediðiniz y koordinatý ?"); koordinat.setsonY(new Scanner(System.in).nextByte());
			
	    	if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='\0'
	    			|| Character.isUpperCase(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()])==true)  //boþ koordiinat veya rakip taþý seçme durumunda 
	    		{ hata1=true;  System.out.println("Hatalý koordinat seçimi"); System.out.println(); }
	    	
	    	if(hata1!=true && tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]!='\0')
	    	  {
	    		hata1=false; 
	    		beyaz.koordinatiAl(koordinat);    
	    		beyaz.tahtayiAl(tahta);      
	    		
	    		   if(beyaz.tahtayaGonder()) 
	    		      {
	    			    System.out.println("hatalý koordinat giriyorsunuz "); 
	    			    hata1=true;  
	    		      }
	    	  }
	    	
	      }
	    		
			
			

			 
			//Siyah için beyaz hata yapmamalý
			
	    	if(hata1!=true)
	    	{

				tahta.yazdir(); System.out.println();
	    		System.out.println("Siyah taþlý oyuncumuz sýra sizin,oynatmak istediðiniz taþýn X koordinatý?");
		    	koordinat.setbasX(new Scanner(System.in).nextByte());
		    	System.out.println("Y koordinatý lütfen ?"); koordinat.setbasY(new Scanner(System.in).nextByte());
		    	System.out.println("Götürmek istediðiniz x koordinatý?"); koordinat.setsonX(new Scanner(System.in).nextByte());
		    	System.out.println("Götürmek istediðiniz y koordinatý ?"); koordinat.setsonY(new Scanner(System.in).nextByte());
	    	  	
	    		     if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='\0' 
	    		    		 || Character.isLowerCase(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()])==true)
	    		     { hata2=true;   System.out.println("Hatalý koordinat"); System.out.println();}
	    		
	    		      if(hata2!=true && tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]!='\0')
		    	          {
		    		        hata2=false; 
		    		        siyah.koordinatiAl(koordinat);  
		    		        siyah.tahtayiAl(tahta);     
		    		
		    		             if(siyah.tahtayaGonder())
		    		                {
		    			                System.out.println("hatalý koordinat giriyorsunuz "); 
		    		                    hata2=true; //yanlýþ koordinat girmiþse 
		    		                }
		    		
		    	          }
	 
	    		
	    	 }
	    	
	    	 
		}
	
		
	}
}
