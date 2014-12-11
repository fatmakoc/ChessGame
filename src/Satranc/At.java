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
		
		int a=koordinat.getsonY()-2;
		int b=koordinat.getsonX()-1;
		int c=koordinat.getsonX()+1;
		int d=koordinat.getsonX()+2;
		int e=koordinat.getsonX()-2;
		int f=koordinat.getsonY()-1;
		int g=koordinat.getsonY()+1;
		int h=koordinat.getsonY()+2;
		
		     if( Degistir == 1)
		  {
			  tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]='a';
        	  tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';


        	  if((a>=0 && a<=7 && b>= 0 && b<=7 && tahta.tahta[a][b]=='þ' ) || (b>=0 && b<=7 && h>=0 && h<=7 && tahta.tahta[h][b]=='þ') || (a>=0 && a<=7 && c>= 0 && c<= 7 && tahta.tahta[a][c]=='þ') || (f>=0 && f<=7 && d>= 0 && d<=7 && tahta.tahta[f][d]=='þ' )|| (f>=0 && f<=7 && e>=0 && e<=7 &&  tahta.tahta[f][e]=='þ') ||  (g>=0 && g<=7 && d>= 0 && d<=7 && tahta.tahta[g][d]=='þ') || (g>=0 && g<=7 && e>=0 && e<=7 && tahta.tahta[g][e]=='þ') ||(c>= 0 && c<= 7 && h>=0 && h<=7 && tahta.tahta[h][c]=='þ')) {  

		     		System.out.println("Beyaz oyuncu þah çekti. ");
        	    }
			
		  
		  } 
		
		
		   else if( Degistir == 2)
	    	{
			  tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]='A';
        	  tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
        	  
        	  if((a>=0 && a<=7 && b>= 0 && b<=7 && tahta.tahta[a][b]=='þ' ) || (b>=0 && b<=7 && h>=0 && h<=7 && tahta.tahta[h][b]=='þ') || (a>=0 && a<=7 && c>= 0 && c<= 7 && tahta.tahta[a][c]=='þ') || (f>=0 && f<=7 && d>= 0 && d<=7 && tahta.tahta[f][d]=='þ' )|| (f>=0 && f<=7 && e>=0 && e<=7 &&  tahta.tahta[f][e]=='þ') ||  (g>=0 && g<=7 && d>= 0 && d<=7 && tahta.tahta[g][d]=='þ') || (g>=0 && g<=7 && e>=0 && e<=7 && tahta.tahta[g][e]=='þ') ||(c>= 0 && c<= 7 && h>=0 && h<=7 && tahta.tahta[h][c]=='þ')) {  

		     		System.out.println("Siyah oyuncu þah çekti. ");
        	    }
        	  }
		    
		
		
		System.out.println();	
		return yanlis_koordinat;
	}

}
