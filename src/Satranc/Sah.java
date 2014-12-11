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
			
			//Beyaz için rok (1. durum)
			if(((koordinat.getbasY() == 7 && koordinat.getbasX() == 4) && (koordinat.getsonY() == 7 && koordinat.getsonX() == 6)) && (tahta.tahta[7][7] == 'k') && 
					(tahta.tahta[7][5] == ' ' && tahta.tahta[7][6] == ' ') && tahta.tahta[7][4] == 'þ')
			{
				tahta.tahta[7][6] = 'þ';
				tahta.tahta[7][5] = 'k';
				tahta.tahta[7][4] = ' ';
				tahta.tahta[7][7] = ' '; 
				System.out.println("Beyaz oyuncu Rok yaptý");
				
			}
			//Beyaz için rok (2.durum)
			else if(((koordinat.getbasY() == 7 && koordinat.getbasX() == 4) && (koordinat.getsonY() == 7 && koordinat.getsonX() == 2)) && (tahta.tahta[7][0] == 'k') && 
					(tahta.tahta[7][1] == ' ' && tahta.tahta[7][2] == ' ' && tahta.tahta[7][3] == ' ') && tahta.tahta[7][4] == 'þ')
			{
				tahta.tahta[7][2] = 'þ';
				tahta.tahta[7][3] = 'k';
				tahta.tahta[7][4] = ' ';
				tahta.tahta[7][0] = ' '; 
				System.out.println("Beyaz oyuncu Rok yaptý");
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
			
			
			// Siyah için rok(1.durum)
						if(((koordinat.getbasY() == 0 && koordinat.getbasX() == 4) && (koordinat.getsonY() == 0 && koordinat.getsonX() == 6)) && (tahta.tahta[0][7] == 'K') && 
								(tahta.tahta[0][5] == ' ' && tahta.tahta[0][6] == ' ') && tahta.tahta[0][4] == 'Þ')
						{
							tahta.tahta[0][6] = 'Þ';
							tahta.tahta[0][5] = 'K';
							tahta.tahta[0][4] = ' ';
							tahta.tahta[0][7] = ' '; 
							System.out.println("Siyah oyuncu Rok yaptý");
							
						}
						
						//Siyah oyuncu için rok(2.durum)
						else if(((koordinat.getbasY() == 0 && koordinat.getbasX() == 4) && (koordinat.getsonY() == 0 && koordinat.getsonX() == 2)) && (tahta.tahta[0][0] == 'K') && 
								(tahta.tahta[0][1] == ' ' && tahta.tahta[0][2] == ' ' && tahta.tahta[0][3] == ' ') && tahta.tahta[0][4] == 'Þ')
						{
							tahta.tahta[0][2] = 'Þ';
							tahta.tahta[0][3] = 'K';
							tahta.tahta[0][4] = ' ';
							tahta.tahta[0][0] = ' '; 
							System.out.println("Siyah oyuncu Rok yaptý");
							
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
