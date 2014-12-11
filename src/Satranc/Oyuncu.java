package Satranc;

public class Oyuncu {

	Koordinat koordinat=new Koordinat();
	Tahta tahta=new Tahta();
	boolean hatali_koordinat=true;
	
	public void tahtayiAl(Tahta tahta)
	{
		this.tahta=tahta;
	}
	
	
	public void koordinatiAl(Koordinat koordinat)
	{
		this.koordinat=koordinat;
	}
	
	
	public boolean  tahtayaGonder() 
	{
		
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='P' || tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='p')
		{
			hatali_koordinat=tahta.yerlestir(new Piyon(),koordinat,tahta);
		}
		else if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='K' || tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='k')
		{
			hatali_koordinat=tahta.yerlestir(new Kale(),koordinat,tahta);
		}
		else if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='F' || tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='f')
		{
			hatali_koordinat=tahta.yerlestir(new Fil(),koordinat,tahta);
		}
		else if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='A' || tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='a')
		{
			hatali_koordinat=tahta.yerlestir(new At(),koordinat,tahta);
		}
		else if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='V' || tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='v')
		{
			hatali_koordinat=tahta.yerlestir(new Vezir(),koordinat,tahta);
		}
		else if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='Þ' || tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='þ')
		{
			hatali_koordinat=tahta.yerlestir(new Sah(),koordinat,tahta);
		}
		
		return hatali_koordinat;
		
	}
	
	
}
