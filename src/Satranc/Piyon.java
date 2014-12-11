package Satranc;

public class Piyon extends Tas {


	public boolean  hamleYap(Koordinat koordinat,Tahta tahta) {
		
		int xFark =(koordinat.getbasX() - koordinat.getsonX());
		int yFark = (koordinat.getbasY() - koordinat.getsonY());
		
		boolean yanlis_koordinat=false;
		int Degistir = 0;
		
		//1.oyuncu için
		
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == 'p'){
			//tek kare oynatma
			if(xFark == 0 && yFark == 1 && (Character.isUpperCase(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()])==true 
					|| tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]!=' ')){
				
				Degistir = 1;
				
			}
		
		//yeme islemi
		else if(((xFark == 1 && yFark == 1) || (xFark == -1 && yFark == 1)) && 
				                    Character.isUpperCase(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()])==true )
		{
				Degistir = 1;
			
		}
		
		//2 kare oynatma
		else if(koordinat.getbasY() == 6 && (xFark == 0 && yFark == 2) && (Character.isLowerCase(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()])==false))
		{
			Degistir = 1;
			
		}	
		
		}	
		
		//2.oyuncu için
		if( tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == 'P'){
			//tek kare oynatma
			if(xFark == 0 && yFark == -1 && (Character.isLowerCase(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()])==true 
					|| tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]!=' ')){
				Degistir = 2;
				
			}
		//yeme islemi
			
		else if(((xFark == -1 && yFark == 1) && (xFark == 1 && yFark == 1))  && 
				                 Character.isLowerCase(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()])==true )
		{
			
				Degistir = 2;
				
		
		}
		//2 kare oynatma
			
		else if(koordinat.getbasY() == 1 && (xFark == 0 && yFark == -2) && Character.isLowerCase(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()])==false)
              
		{
			Degistir = 2;
			
		}	
		
		}
		
		if( Degistir==0) yanlis_koordinat=true;	
		
		
		if(Degistir == 1)
		{
			tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
			tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] = 'p';
		}
		else if(Degistir == 2)
		{
			tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
			tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] = 'P';
		}
		
	
		System.out.println();
		return yanlis_koordinat;
		
	}

}
