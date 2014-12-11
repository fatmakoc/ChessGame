package Satranc;

public class Kale extends Tas{

	
	public boolean hamleYap(Koordinat koordinat,Tahta tahta) {
	
		int a=koordinat.getbasY();
		int b=koordinat.getbasX();
		boolean girdi=false; 
		boolean yanlis_koordinat=false;
		int c=koordinat.getsonY();
		int d=koordinat.getsonX();
		boolean tehdit=false;
		
		
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='k') //beyazýn kale taþý
		{
		
		//dikey yukarý
		
		      if(koordinat.getsonY() < koordinat.getbasY() && koordinat.getbasX()==koordinat.getsonX())
		           {
			            while(tahta.tahta[a-1][b]==' ' || Character.isLowerCase(tahta.tahta[a-1][b])!=true || (koordinat.getsonX()==b && koordinat.getsonY()==a-1))
		                     {
			 
			                     if(koordinat.getsonX()==b && koordinat.getsonY()==a-1 && Character.isLowerCase(tahta.tahta[a-1][b])==false)
			                          {
				                         tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
        		                         tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' '; 
        		                         girdi=true;
        		                         break;
			                          }
		           	     a=a-1;
		                     }
		           }
		      
		        a=koordinat.getbasY();
				b=koordinat.getbasX();
				
				//dikey aþaðý
				
				if(girdi!=true && koordinat.getsonY() > koordinat.getbasY() && koordinat.getbasX()==koordinat.getsonX())
				   {
				        while(tahta.tahta[a+1][b]==' ' || Character.isLowerCase(tahta.tahta[a+1][b])!=true || (koordinat.getsonX()==b && koordinat.getsonY()==a+1))
				             {
					   
				                	if(koordinat.getsonX()==b && koordinat.getsonY()==a+1 && Character.isLowerCase(tahta.tahta[a+1][b])==false)
					                    {
						                   tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
		        		                   tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';  
		        		                   girdi=true;
		        		                   break;
					                    }
					
				  	         a=a+1;
				             }
				  }
		
				a=koordinat.getbasY();
				b=koordinat.getbasX();
				
				//yatay sola 
				
				if(girdi!=true && koordinat.getsonY()==koordinat.getbasY() && koordinat.getbasX() > koordinat.getsonX())
				{
				     while(tahta.tahta[a][b-1]==' ' || Character.isLowerCase(tahta.tahta[a][b-1])!=true ||  (koordinat.getsonX()==b-1 && koordinat.getsonY()==a))
			           	{
					 
				         	if(koordinat.getsonX()==b-1 && koordinat.getsonY()==a && Character.isLowerCase(tahta.tahta[a][b-1])==false)
					            {
						            tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
		        		            tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
		        		            girdi=true;
		        		            break;
					            }
					        b=b-1;
			        	}
				}
				
				a=koordinat.getbasY();
				b=koordinat.getbasX();
				
				//yatay saða 
				
				if(girdi!=true && koordinat.getsonY()==koordinat.getbasY() && koordinat.getbasX() < koordinat.getsonX())
				{
				    while(tahta.tahta[a][b+1]==' ' || Character.isLowerCase(tahta.tahta[a][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a))
				       {
					 
				            	if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a && Character.isLowerCase(tahta.tahta[a+1][b])==false)
					                  {
						                   tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
		        		                   tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
		        		                   girdi=true;
		        		                   break;
					                   }	
					      b=b+1;
					
				       }
				}
				System.out.println();		
		}
		
		if(girdi==true && Character.isLowerCase(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()])==true)
		{
			tehdit=false;
			c=koordinat.getsonY();
			d=koordinat.getsonX();
			
			while(c-1>0 && tehdit==false && (tahta.tahta[c-1][d]==' ' || Character.isLowerCase(tahta.tahta[c-1][d])!=true))
            {

                if(tahta.tahta[c-1][d]=='Þ')
                     {
                       System.out.println("Beyaz taþlý oyuncu siyahý tehdit ediyor.");
                       tehdit=true;
                        break;
                     }
  	           c=c-1;
            }
			
			c=koordinat.getsonY();
			d=koordinat.getsonX();
			
			 while(c+1<7 && tehdit==false && (tahta.tahta[c+1][d]==' ' || Character.isLowerCase(tahta.tahta[c+1][d])!=true))
             {
	   
                	if(tahta.tahta[c+1][d]=='Þ')
	                    {
		                   System.out.println("Beyaz taþlý oyuncu siyahý tehdit ediyor.");
		                   tehdit=true;
		                   break;
	                    }
	
  	         c=c+1;
             }
			
			 c=koordinat.getsonY();
		     d=koordinat.getsonX();
				
				 while(d-1>0 && tehdit==false && (tahta.tahta[c][d-1]==' ' || Character.isLowerCase(tahta.tahta[c][d-1])!=true) )
	             {
		   
	                	if(tahta.tahta[c][d-1]=='Þ')
		                    {
			                   System.out.println("Beyaz taþlý oyuncu siyahý tehdit ediyor.");
			                   tehdit=true;
			                   break;
		                    }
		
	  	         d-=1;
	             }
				 
			  c=koordinat.getsonY();
			  d=koordinat.getsonX();
					
					 while(d+1<7  && tehdit==false && (tahta.tahta[c][d+1]==' ' || Character.isLowerCase(tahta.tahta[c][d+1])!=true))
		             {
			   
		                	if(tahta.tahta[c][d+1]=='Þ')
			                    {
				                   System.out.println("Beyaz taþlý oyuncu siyahý tehdit ediyor.");
				                   tehdit=true;
				                   break;
			                    }
			
		  	        d+=1;
		             } 	
		}
		
		
		
	        
	        //Siyah Kale içinnnnn.....
		
		 if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='K') //siyah kale taþý
			{
			
			
			//dikey yukarý
			
			      if(koordinat.getsonY() < koordinat.getbasY() && koordinat.getbasX()==koordinat.getsonX())
			           {
				            while(tahta.tahta[a-1][b]==' ' || Character.isUpperCase(tahta.tahta[a-1][b])!=true || (koordinat.getsonX()==b && koordinat.getsonY()==a-1))
			                     {
				 
				                     if(koordinat.getsonX()==b && koordinat.getsonY()==a-1 && Character.isUpperCase(tahta.tahta[a-1][b])==false)
				                          {
					                         tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
	        		                         tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';	        		                     
	        		                         girdi=true;
	        		                         break;
				                          }
			           	     a=a-1;
			                     }
			           }
			      
			        a=koordinat.getbasY();
					b=koordinat.getbasX();
					
					//dikey aþaðý
					
					if(girdi!=true && koordinat.getsonY() > koordinat.getbasY() && koordinat.getbasX()==koordinat.getsonX())
					   {
					        while(tahta.tahta[a+1][b]==' ' || Character.isUpperCase(tahta.tahta[a+1][b])!=true || (koordinat.getsonX()==b && koordinat.getsonY()==a+1))
					             {
						   
					                	if(koordinat.getsonX()==b && koordinat.getsonY()==a+1 && Character.isUpperCase(tahta.tahta[a+1][b])==false)
						                    {
							                   tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
			        		                   tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
			        		                   girdi=true;
			        		                   break;
						                    }
						
					  	         a=a+1;
					             }
					  }
			
					a=koordinat.getbasY();
					b=koordinat.getbasX();
					
					//yatay sola 
					
					if(girdi!=true && koordinat.getsonY()==koordinat.getbasY() && koordinat.getbasX() > koordinat.getsonX())
					{
					     while(tahta.tahta[a][b-1]==' ' || Character.isUpperCase(tahta.tahta[a][b-1])!=true ||  (koordinat.getsonX()==b-1 && koordinat.getsonY()==a))
				           	{
						 
					         	if(koordinat.getsonX()==b-1 && koordinat.getsonY()==a && Character.isUpperCase(tahta.tahta[a][b-1])==false)
						            {
							            tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
			        		            tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
			        		            girdi=true;
			        		            break;
						            }
						        b=b-1;
				        	}
					}
					
					a=koordinat.getbasY();
					b=koordinat.getbasX();
					
					//yatay saða 
					
					if(girdi!=true && koordinat.getsonY()==koordinat.getbasY() && koordinat.getbasX() < koordinat.getsonX())
					{
					    while(tahta.tahta[a][b+1]==' ' || Character.isUpperCase(tahta.tahta[a][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a))
					       {
						 
					            	if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a && Character.isUpperCase(tahta.tahta[a+1][b])==false)
						                  {
							                   tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
			        		                   tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
	                                           girdi=true;
			        		                   break;
						                   }	
						      b=b+1;
						
					       }
					}
					
				
			}
		 
		 tehdit=false;
		 
		 if(girdi==true && Character.isUpperCase(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()])==true)
			{
			    
				c=koordinat.getsonY();
				d=koordinat.getsonX();
				
				while(c-1>0 && tehdit==false && (tahta.tahta[c-1][d]==' ' || Character.isUpperCase(tahta.tahta[c-1][d])!=true) )
	            {

	                if(tahta.tahta[c-1][d]=='þ')
	                     {
	                       System.out.println("Siyah taþlý oyuncu siyahý tehdit ediyor.");
	                       tehdit=true;
	                        break;
	                     }
	  	           c=c-1;
	            }
				
				c=koordinat.getsonY();
				d=koordinat.getsonX();
				
				 while(c+1<7 && tehdit==false && (tahta.tahta[c+1][d]==' ' || Character.isUpperCase(tahta.tahta[c+1][d])!=true))
	             {
		   
	                	if(tahta.tahta[c+1][d]=='þ')
		                    {
			                   System.out.println("Siyah taþlý oyuncu siyahý tehdit ediyor.");
			                   tehdit=true;
			                   break;
		                    }
		
	  	         c=c+1;
	             }
				
				 c=koordinat.getsonY();
			     d=koordinat.getsonX();
				
					 while(d-1>0 && tehdit==false && (tahta.tahta[c][d-1]==' ' || Character.isUpperCase(tahta.tahta[c][d-1])!=true))
		             {
			   
		                	if(tahta.tahta[c][d-1]=='þ')
			                    {
				                   System.out.println("Siyah taþlý oyuncu siyahý tehdit ediyor.");
				                   tehdit=true;
				                   break;
			                    }
			
		  	         d-=1;
		             }
					 
				  c=koordinat.getsonY();
				  d=koordinat.getsonX();
						
						 while(d+1<7 && tehdit==false && (tahta.tahta[c][d+1]==' ' || Character.isUpperCase(tahta.tahta[c][d+1])!=true))
			             {
				   
			                	if(tahta.tahta[c][d+1]=='þ')
				                    {
					                   System.out.println("Siyah taþlý oyuncu siyahý tehdit ediyor.");
					                   tehdit=true;
					                   break;
				                    }
				
			  	        d+=1;
			             } 	
			} 
 
		    if(girdi==false) yanlis_koordinat=true;
		 
			System.out.println();
			return yanlis_koordinat;
		  
		 
		 
		 
	}

}
