package Satranc;

public class Piyon extends Tas {


	public void hamleYap(Koordinat koordinat,Tahta tahta) {
		
		int xFark =(koordinat.getbasX() - koordinat.getsonX());
		int yFark = (koordinat.getbasY() - koordinat.getsonY());
		
		int Degistir = 0;
		
		//1.oyuncu için
		
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == 'p'){
			//tek kare oynatma
			if(xFark == 0 && yFark == 1){
				Degistir = 1;
				
			}
		
		//yeme islemi
		else if((xFark == 1 && yFark == 1) || (xFark == -1 && yFark == 1))
		{
			if(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] != ' ' )
			{
				Degistir = 1;
				
			}
		}
		
		//2 kare oynatma
		else if(koordinat.getbasY() == 6 && (xFark == 0 && yFark == 2))
		{
			Degistir = 1;
			
		}	
		
		}	
		
		//2.oyuncu için
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == 'P'){
			//tek kare oynatma
			if(xFark == 0 && yFark == -1){
				Degistir = 2;
				
			}
		//yeme islemi
		else if((xFark == -1 && yFark == 1) && (xFark == 1 && yFark == 1))
		{
			if(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == ' ')
			{
				Degistir = 2;
				
			}
		}
		//2 kare oynatma
		else if(koordinat.getbasY() == 1 && (xFark == 0 && yFark == -2))
		{
			Degistir = 2;
			
		}	
		
		}
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
		
	
	}

}
