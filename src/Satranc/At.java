package Satranc;

public class At extends Tas {

	
	public boolean hamleYap(Koordinat koordinat,Tahta tahta) {
	
		int xFark =Math.abs(koordinat.getbasX() - koordinat.getsonX());
		int yFark = Math.abs(koordinat.getbasY() - koordinat.getsonY());
		boolean  yanlis_koordinat=false;
		int Degistir = 0;
		
		//1.oyuncunun at için oynama durumlarý
		
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == 'a')
		{
			if(((xFark == 1 && yFark == 2) || (xFark == 2 && yFark == 1)))
			{
				//oynayacaðý koordinatýn boþ olma ve rakip taþý bulundurma durumu(yeme)
				if((tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] != ' ') || (tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'P') || (tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'K')|| (tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'A') || 
						(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'F')|| (tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'V'))
					Degistir = 1; 
				   
			}
		}
		
		//2.oyuncunun at için oynama durumlarý
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == 'A')
		{
			if(((xFark == 1 && yFark == 2) || (xFark == 2 && yFark == 1)))
			{
				if(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] != ' ' || tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'p' || tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'k'|| tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'a' || 
						tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'f'|| tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == 'v')
					    Degistir = 2;
				   
			}
			
		}
		
		//1. ve 2.oyuncunun oynayabilme durumlarý
		
		if( Degistir==0) yanlis_koordinat=true;		 //þartlara uymamýþ deðiþmemiþ demekki hataalý
		
		
		     if( Degistir == 1)
		  {
			  tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]='a';
        	  tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
		  } 
		
		
		   else if( Degistir == 2)
	    	{
			  tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]='A';
        	  tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
		    }
		
		
		System.out.println();	
		return yanlis_koordinat;
	}

}
