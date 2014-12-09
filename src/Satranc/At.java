package Satranc;

public class At extends Tas {

	
	public void hamleYap(Koordinat koordinat,Tahta tahta) {
	
		int xFark=Math.abs(koordinat.getbasX()-koordinat.getsonX());
		int yFark=Math.abs(koordinat.getbasY()-koordinat.getsonY());
		int Degistir=0;
		
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='a')
		{
			if((xFark==2 && yFark==1) || (xFark==1 && yFark==2))
			{
				Degistir=1;
			}
			
			
		}
		
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='A')
		{
			if((xFark==2 && yFark==1) || (xFark==1 && yFark==2))
			{
				Degistir=2;
			}
		}
		
		if(Degistir==1)
		{
			tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]='a';
			tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
		}
		
		else if(Degistir==2)
		{
			tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]='A';
			tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
		}
		
		
		tahta.yazdir(); System.out.println();
		
	}

}
