package Satranc;

import java.util.Scanner;

public class Oyna {

	public static void main(String[] args) {
		
		
		boolean hata1=false;
		boolean hata1_1=false;
		boolean hata1_2=false;
		boolean hata2=false;
		boolean hata2_1=false;
		boolean hata2_2=false;
		Tahta tahta =new Tahta();
		Koordinat koordinat=new Koordinat();
		Oyuncu beyaz=new Oyuncu();
		Oyuncu siyah=new Oyuncu();
		
		
		while(true)
		{

			if(hata2!=true && hata2_1!=true && hata2_2!=true )  
			{

		    tahta.yazdir(); System.out.println();
			System.out.println("Beyaz taþlý oyuncumuz sýra sizin,oynatmak istediðiniz taþýn X koordinatý?");
	    	koordinat.setbasX(new Scanner(System.in).nextByte());
	    	System.out.println("Y koordinatý lütfen ?"); koordinat.setbasY(new Scanner(System.in).nextByte());
	    	System.out.println("Götürmek istediðiniz x koordinatý?"); koordinat.setsonX(new Scanner(System.in).nextByte());
	    	System.out.println("Götürmek istediðiniz y koordinatý ?"); koordinat.setsonY(new Scanner(System.in).nextByte());
			
	    	if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='\0')  //boþ koordiinat veya rakip taþý seçme durumunda 
	    		{ hata1=true;  System.out.println("Hatalý koordinat seçimi"); System.out.println(); }
	    	else 
	    		hata1=false;
	    	
	    	if(Character.isUpperCase(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()])==true){
	    	    hata1_1=true;  System.out.println("Hatalý seçim! Rakip taþý oynayamazsýnýz");
	    	}
	    	else 
	    		hata1_1=false;
	    	
	    	
	    	if(hata1_1!=true && tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]!='\0')
	    	  {
	    		 
	    		beyaz.koordinatiAl(koordinat);    
	    		beyaz.tahtayiAl(tahta);      
	    		
	    		   if(beyaz.tahtayaGonder()) 
	    		      {
	    			    System.out.println("hatalý koordinat giriyorsunuz "); 
	    			    hata1_2=true;  
	    		      }
	    		   else 
	    		   {
	    			   hata1=false;  hata1_1=false;  hata1_2=false;
	    		   }
	    	  }
	    	
	      }
	    		
			
			

			 
			//Siyah için beyaz hata yapmamalý
			
	    	if(hata1!=true && hata1_1!=true && hata1_2!=true )
	    	{

				tahta.yazdir(); System.out.println();
	    		System.out.println("Siyah taþlý oyuncumuz sýra sizin,oynatmak istediðiniz taþýn X koordinatý?");
		    	koordinat.setbasX(new Scanner(System.in).nextByte());
		    	System.out.println("Y koordinatý lütfen ?"); koordinat.setbasY(new Scanner(System.in).nextByte());
		    	System.out.println("Götürmek istediðiniz x koordinatý?"); koordinat.setsonX(new Scanner(System.in).nextByte());
		    	System.out.println("Götürmek istediðiniz y koordinatý ?"); koordinat.setsonY(new Scanner(System.in).nextByte());
	    	  	
	    		     if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='\0' )
	    		     { hata2=true;   System.out.println("Hatalý koordinat"); System.out.println();}
	    		     else
	    		    	 hata2=false;
	    		
	    		     if(Character.isLowerCase(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()])==true){
	    		    	 hata2_1=true;  System.out.println("Hatalý seçim! Rakip taþý oynayamazsýnýz ");
	    		     }
	    		    	    
	    		    	else if(Character.isUpperCase(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()])==true)
	    		    		hata2_1=false;
	    		     
	    		      if( hata2_1==false && tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]!='\0')
		    	          {
		    		       
		    		        siyah.koordinatiAl(koordinat);  
		    		        siyah.tahtayiAl(tahta);     
		    		
		    		             if(siyah.tahtayaGonder())
		    		                {
		    			                System.out.println("hatalý koordinat giriyorsunuz "); 
		    		                    hata2=true; //yanlýþ koordinat girmiþse 
		    		                }
		    		             else 
		    		             {
		    		            	 hata2=false; hata2_1=false; hata2_2=false;
		    		             }
		    		
		    	          }
	 
	    		
	    	 }
	    	
	    	 
		}
	
		
	}
}
