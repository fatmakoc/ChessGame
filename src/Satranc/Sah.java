package Satranc;

public class Sah extends Tas{

	
	public boolean hamleYap(Koordinat koordinat,Tahta tahta) {
		
		
		int xFark =(koordinat.getbasX() - koordinat.getsonX());
		int yFark = (koordinat.getbasY() - koordinat.getsonY());
		boolean yanlis_koordinat=false;
		int Degistir = 0;
		
		//1.oyuncu için
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == 'þ')
		{
			//þahýn oynama durumlarý
			if((xFark == 0 && yFark == 1) || (xFark == 1 && yFark == 1) || (xFark == 1 && yFark == 0) || (xFark == 1 && yFark == -1) || (xFark == 0 && yFark == -1) || (xFark == -1 && yFark == -1) || (xFark == -1 && yFark == 0) || (xFark == -1 && yFark == 1))
			{
				
				if(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] != ' ')
				{
					Degistir = 1;
					
				}
				
				//oynanacak pozisyonda taþ varsa ve yiyebileceði taþlar varsa 
				else if((Character.isUpperCase(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()])==true  ))
				{
					Degistir = 1;
					
				}
			}
			
		}
		
		
		
		//2.oyuncu için
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == 'Þ')
		{
			//þahýn oynama durumlarý
			if((xFark == 0 && yFark == 1)|| (xFark == 1 && yFark == 1) || (xFark == 1 && yFark == 0) || (xFark == 1 && yFark == -1) || (xFark == 0 && yFark == -1) || (xFark == -1 && yFark == -1) || (xFark == -1 && yFark == 0) || (xFark == -1 && yFark == 1) )
			{
				if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] != ' ')
				{
					Degistir = 2;
				}
				//oynanacak pozisyonda taþ varsa ve yiyebileceði taþlar varsa 
				else if(Character.isLowerCase(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()])==true)
				{
					Degistir = 2;
				}
			}
				
		}
		
		if(Degistir==0)  yanlis_koordinat=true;
		
		if(Degistir == 1)
		{
			tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
			tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] = 'þ';
		}
		else if(Degistir == 2)
		{
			tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
			tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] = 'Þ';
		
		}
		
		System.out.println();
		return yanlis_koordinat;
		
	}

}
