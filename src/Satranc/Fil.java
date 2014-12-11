package Satranc;

public class Fil extends Tas{

	
	public boolean hamleYap(Koordinat koordinat,Tahta tahta) {
		

		int a=koordinat.getbasY();   
		int b=koordinat.getbasX();
		boolean girdi=false; 
		boolean yanlis_koordinat=false;
		
		
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='f')  //beyaz oyuncu oynuyorsa
		{
		
		//sol yukarý çapraz 
		
		
		if(koordinat.getsonX() < koordinat.getbasX() && koordinat.getbasY() > koordinat.getsonY())
		{	
			//boþþa ve kendi taþýndan farklý bir taþsa
		       while(tahta.tahta[a-1][b-1]==' ' || Character.isLowerCase(tahta.tahta[a-1][b-1])!=true || (koordinat.getsonX()==b-1 && koordinat.getsonY()==a-1 ))
		        {
			        if(koordinat.getsonX()==b-1 && koordinat.getsonY()==a-1 && Character.isLowerCase(tahta.tahta[a-1][b-1])==false)
			            {
				              tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
        		              tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
        		              girdi=true;
        		              break;
			            }
			
		          	a=a-1;  b=b-1;
			
	            }
		}
		
		a=koordinat.getbasY();
		b=koordinat.getbasX();
		
		//sað yukarý çapraz 
		
	    if(girdi!=true && koordinat.getsonX() > koordinat.getbasX() && koordinat.getsonY() < koordinat.getbasY())
		{	
		        while(tahta.tahta[a-1][b+1]==' ' || Character.isLowerCase(tahta.tahta[a-1][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a-1 ))
		         {
			         if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a-1 && Character.isLowerCase(tahta.tahta[a-1][b+1])==false)
			            {
				            tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
        		            tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
        		            girdi=true;
        		            break;
			            }
			
		         	a=a-1;  b=b+1;
			
		         }
		}
		
		a=koordinat.getbasY();
		b=koordinat.getbasX();
		
		//sol aþaðý çapraz 
		
		if(girdi!=true && koordinat.getsonX() < koordinat.getbasX() && koordinat.getsonY() > koordinat.getbasY())
		{	
		    while(tahta.tahta[a+1][b-1]==' ' || Character.isLowerCase(tahta.tahta[a+1][b-1])!=true || (koordinat.getsonX()==b-1 && koordinat.getsonY()==a+1 ))
	           	{
			       if (koordinat.getsonX()==b-1 && koordinat.getsonY()==a+1 && Character.isLowerCase(tahta.tahta[a+1][b-1])==false)
			            {
				             tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
        		             tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
        		             girdi=true; 
        		             break;
			            }
			
			     a=a+1;  b=b-1;		
		        }
		}
		
		a=koordinat.getbasY();
		b=koordinat.getbasX();
		
		//sað aþaðý çapraz 
		
		if(girdi!=true && koordinat.getsonX() > koordinat.getbasX() && koordinat.getsonY() > koordinat.getbasY())
		{	
		    while(tahta.tahta[a+1][b+1]==' ' || Character.isLowerCase(tahta.tahta[a+1][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a+1 ))
		         {
			         if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a+1 && Character.isLowerCase(tahta.tahta[a+1][b+1])==false)
			             {
				              tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
        		              tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
        		              girdi=true;
        		              break;
			             }
			
			     a=a+1;  b=b+1;
			
	           	}
		}
	}
	
		System.out.println();	 
		
		      //Siyah fil için
		
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='F')
		{
			
			//sol yukarý çapraz 
			
			
			if(koordinat.getsonX() < koordinat.getbasX() && koordinat.getbasY() > koordinat.getsonY())
			{	
				//boþþa veyaz kendi taþýndan farklý bir taþsa
			       while(tahta.tahta[a-1][b-1]==' ' || Character.isUpperCase(tahta.tahta[a-1][b-1])!=true || (koordinat.getsonX()==b-1 && koordinat.getsonY()==a-1 ))
			        {
				        if(koordinat.getsonX()==b-1 && koordinat.getsonY()==a-1 && Character.isUpperCase(tahta.tahta[a-1][b-1])==false)
				            {
					              tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
	        		              tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
	        		              girdi=true;
	        		              break;
				            }
				
			          	a=a-1;  b=b-1;
				
		            }
			}
			
			a=koordinat.getbasY();
			b=koordinat.getbasX();
			
			//sað yukarý çapraz 
			
		    if(girdi!=true && koordinat.getsonX() > koordinat.getbasX() && koordinat.getsonY() < koordinat.getbasY())
			{	
			        while(tahta.tahta[a-1][b+1]==' ' || Character.isUpperCase(tahta.tahta[a-1][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a-1 ))
			         {
				         if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a-1 && Character.isUpperCase(tahta.tahta[a-1][b+1])==false)
				            {
					            tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
	        		            tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
	        		            girdi=true;
	        		            break;
				            }
				
			         	a=a-1;  b=b+1;
				
			         }
			}
			
			a=koordinat.getbasY();
			b=koordinat.getbasX();
			
			//sol aþaðý çapraz 
			
			if(girdi!=true && koordinat.getsonX() < koordinat.getbasX() && koordinat.getsonY() > koordinat.getbasY())
			{	
			    while(tahta.tahta[a+1][b-1]==' ' || Character.isUpperCase(tahta.tahta[a+1][b-1])!=true || (koordinat.getsonX()==b-1 && koordinat.getsonY()==a+1 ))
		           	{
				       if (koordinat.getsonX()==b-1 && koordinat.getsonY()==a+1 && Character.isUpperCase(tahta.tahta[a+1][b-1])==false)
				            {
					             tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
	        		             tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
	        		             girdi=true; 
	        		             break;
				            }
				
				     a=a+1;  b=b-1;		
			        }
			}
			
			a=koordinat.getbasY();
			b=koordinat.getbasX();
			
			//sað aþaðý çapraz 
			
			if(girdi!=true && koordinat.getsonX() > koordinat.getbasX() && koordinat.getsonY() > koordinat.getbasY())
			{	
			    while(tahta.tahta[a+1][b+1]==' ' || Character.isUpperCase(tahta.tahta[a+1][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a+1 ))
			         {
				         if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a+1 && Character.isUpperCase(tahta.tahta[a+1][b+1])==false)
				             {
					              tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
	        		              tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
	        		              girdi=true;
	        		              break;
				             }
				
				     a=a+1;  b=b+1;
				
		           	}
			}
			
	
		}
		
		if(girdi==false) yanlis_koordinat=true;
		
		System.out.println();	
		return yanlis_koordinat;
		
	}

}
