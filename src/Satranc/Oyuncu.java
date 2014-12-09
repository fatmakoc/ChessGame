package Satranc;

public class Oyuncu {

	Koordinat koordinat=new Koordinat();
	Tahta tahta=new Tahta();
	
	public void tahtayiAl(Tahta tahta)
	{
		this.tahta=tahta;
	}
	
	
	public void koordinatiAl(Koordinat koordinat)
	{
		this.koordinat=koordinat;
	}
	
	
	public void tahtayaGonder() 
	{
		
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='P' || tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='p')
		{
			//tahta.yerlestir(new Piyon(),koord,kendi_rengi,yedigi_renk,tahta);
		}
		else if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='K' || tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='k')
		{
			//tahta.yerlestir(new Kale(),koord,kendi_rengi,yedigi_renk,tahta);
		}
		else if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='F' || tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='f')
		{
			//tahta.yerlestir(new Fil(),koord,kendi_rengi,yedigi_renk,tahta);
		}
		else if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='A' || tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='a')
		{
			//tahta.yerlestir(new At(),koord,kendi_rengi,yedigi_renk,tahta);
		}
		else if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='V' || tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='v')
		{
			//tahta.yerlestir(new Vezir(),koord,kendi_rengi,yedigi_renk,tahta);
		}
		else if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='Þ' || tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='þ')
		{
			//tahta.yerlestir(new Sah(),koord,kendi_rengi,yedigi_renk,tahta);
		}
		
		
	}
	
	
}
