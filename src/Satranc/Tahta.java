package Satranc;

public class Tahta {

	public char tahta[][]=new char[8][8];
	
	
	public Tahta(){
		
		tahta[0][0]='K'; tahta[0][1]='A'; tahta[0][2]='F'; tahta[0][3]='V'; tahta[0][4]='Ş'; tahta[0][5]='F'; tahta[0][6]='A'; tahta[0][7]='K';
		tahta[1][0]='P'; tahta[1][1]='P'; tahta[1][2]='P'; tahta[1][3]='P'; tahta[1][4]='P'; tahta[1][5]='P'; tahta[1][6]='P'; tahta[1][7]='P';		
		
		//for WhitePlayer

		tahta[7][0]='k'; tahta[7][1]='a'; tahta[7][2]='f'; tahta[7][3]='v'; tahta[7][4]='ş'; tahta[7][5]='f'; tahta[7][6]='a'; tahta[7][7]='k';
		tahta[6][0]='p'; tahta[6][1]='p'; tahta[6][2]='p'; tahta[6][3]='p'; tahta[6][4]='p'; tahta[6][5]='p'; tahta[6][6]='p'; tahta[6][7]='p';		
		
	}
	
	public void yazdir(){
		
		for(int k=0; k<8; k++)
    		System.out.print("\t"+k);
    	
    	System.out.println();
    	for(int i=0; i<8; i++)
    	{
    		System.out.print(i + "\t");
    		for(int j=0; j<8; j++)
    		{
    			System.out.print(tahta[i][j]+"\t");
    		}
    		System.out.println();
    	}
	}
	
	
	
	public void yerlestir(Tas tas, Koordinat koordinat, Tahta tahta)
	{
		tas.hamleYap(koordinat,tahta);
	}
	

}
