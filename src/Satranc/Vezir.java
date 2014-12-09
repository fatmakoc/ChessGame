package Satranc;

public class Vezir extends Tas {

	
	public void hamleYap(Koordinat koordinat,Tahta tahta) {
		
		

		int a=koordinat.getbasY();
		int b=koordinat.getbasX();
		boolean girdi=false; 
		
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='v') //beyazýn vezir taþý
		{
			  
			if(koordinat.getsonY() < koordinat.getbasY() && koordinat.getbasX() < koordinat.getsonX()) //burda sað yukarý çapraz gittiðini anlýyor.
			{
			     while(tahta.tahta[a-1][b+1]==' ' || Character.isLowerCase(tahta.tahta[a-1][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a-1) ) //burda da gitmek istediði yere kadar kontrol ediyor çünkü taþlarýn üstünden atlayamaz
		              {
		        	      if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a-1 && Character.isLowerCase(tahta.tahta[a-1][b])==false)
		        	            {
		        		            tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
		        		            tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
		        		            girdi=true;
		        		            break;
		        	            }
		        	
		        	    a=a-1; 	b=b+1;	        	 
   		              }
			}
			
			
			 a=koordinat.getbasY();
		     b=koordinat.getbasX();
		         
		     //sol yukarý çapraz
		     
		     if(girdi!=true && koordinat.getsonY() < koordinat.getbasY() && koordinat.getbasX() > koordinat.getsonX())
			 {
		         while(tahta.tahta[a-1][b-1]==' ' || Character.isLowerCase(tahta.tahta[a-1][b-1])!=true || (koordinat.getsonX()==b-1 && koordinat.getsonY()==a-1))
		              {
		        	   
		        	      if(koordinat.getsonX()==b-1 && koordinat.getsonY()==a-1 && Character.isLowerCase(tahta.tahta[a-1][b+1])==false)
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
		        
		      //sol aþaðý çapraz
		        
		        if(girdi!=true && koordinat.getsonY() > koordinat.getbasY() && koordinat.getbasX() > koordinat.getsonX())
				{  		         
		             while(girdi!=true && (tahta.tahta[a+1][b-1]==' ' || Character.isLowerCase(tahta.tahta[a+1][b-1])!=true || (koordinat.getsonX()==b-1 && koordinat.getsonY()==a+1)))
		                  {
		        	          if(koordinat.getsonX()==b-1 && koordinat.getsonY()==a+1 && Character.isLowerCase(tahta.tahta[a+1][b-1])==false)
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
		        
		       if(girdi!=true && koordinat.getsonY() > koordinat.getbasY() && koordinat.getbasX() < koordinat.getsonX())
			   {
		             while(girdi!=true && (tahta.tahta[a+1][b+1]==' ' || Character.isLowerCase(tahta.tahta[a+1][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a+1)))
		                  {
		        	 
		                    	 if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a+1 && Character.isLowerCase(tahta.tahta[a+1][b+1])==false) 
		                    	      {
		        	                      tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
	        		                      tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
	        		                      girdi=true;
	        		                      break;
		        	                  }
		        	     a=a+1; b=b+1;
		                  }
			   }
		         
			     a=koordinat.getbasY();
			     b=koordinat.getbasX(); 
		         
		      // dikey yukarý    
		         
			     if( girdi!=true && koordinat.getsonY() < koordinat.getbasY() && koordinat.getbasX()==koordinat.getsonX())
				 {
		               while(girdi!=true &&  (tahta.tahta[a-1][b]==' ' ||  Character.isLowerCase(tahta.tahta[a-1][b])!=true || (koordinat.getsonX()==b && koordinat.getsonY()==a-1 )))
		                     {
		        	              if(koordinat.getsonX()==b && koordinat.getsonY()==a-1 && Character.isLowerCase(tahta.tahta[a-1][b-1])==false)
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
			            while(girdi!=true &&  (tahta.tahta[a+1][b]==' ' || Character.isLowerCase(tahta.tahta[a+1][b])!=true || (koordinat.getsonX()==b && koordinat.getsonY()==a+1 )))
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
			           while(girdi!=true &&  (tahta.tahta[a][b-1]==' ' || Character.isLowerCase(tahta.tahta[a][b-1])!=true || (koordinat.getsonX()==b-1 && koordinat.getsonY()==a )))
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
			          while(girdi!=true &&  (tahta.tahta[a][b+1]==' ' || Character.isLowerCase(tahta.tahta[a][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a )))
		                   {
		        	           if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a && Character.isLowerCase(tahta.tahta[a][b+1])==false)
		        	               {
		        		               tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
		        		               tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
		        	                   girdi=true;
		        		               break;
		        	               } 
		        	             b=b+1; 
	     	                }
				 }
			     
		            tahta.yazdir(); System.out.println();	
			
		}
	
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='V') //beyazýn vezir taþý
		{
			  
			if(koordinat.getsonY() < koordinat.getbasY() && koordinat.getbasX() < koordinat.getsonX()) //burda sað yukarý çapraz gittiðini anlýyor.
			{
			     while(tahta.tahta[a-1][b+1]==' ' || Character.isUpperCase(tahta.tahta[a-1][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a-1) ) //burda da gitmek istediði yere kadar kontrol ediyor çünkü taþlarýn üstünden atlayamaz
		              {
		        	      if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a-1 && Character.isUpperCase(tahta.tahta[a-1][b])==false)
		        	            {
		        		            tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
		        		            tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
		        		            girdi=true;
		        		            break;
		        	            }
		        	
		        	    a=a-1; 	b=b+1;	        	 
   		              }
			}
			
			
			 a=koordinat.getbasY();
		     b=koordinat.getbasX();
		         
		     //sol yukarý çapraz
		     
		     if(girdi!=true && koordinat.getsonY() < koordinat.getbasY() && koordinat.getbasX() > koordinat.getsonX())
			 {
		         while(tahta.tahta[a-1][b-1]==' ' || Character.isUpperCase(tahta.tahta[a-1][b-1])!=true || (koordinat.getsonX()==b-1 && koordinat.getsonY()==a-1))
		              {
		        	   
		        	      if(koordinat.getsonX()==b-1 && koordinat.getsonY()==a-1 && Character.isUpperCase(tahta.tahta[a-1][b+1])==false)
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
		        
		      //sol aþaðý çapraz
		        
		        if(girdi!=true && koordinat.getsonY() > koordinat.getbasY() && koordinat.getbasX() > koordinat.getsonX())
				{  		         
		             while(girdi!=true && (tahta.tahta[a+1][b-1]==' ' || Character.isUpperCase(tahta.tahta[a+1][b-1])!=true || (koordinat.getsonX()==b-1 && koordinat.getsonY()==a+1)))
		                  {
		        	          if(koordinat.getsonX()==b-1 && koordinat.getsonY()==a+1 && Character.isUpperCase(tahta.tahta[a+1][b-1])==false)
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
		        
		       if(girdi!=true && koordinat.getsonY() > koordinat.getbasY() && koordinat.getbasX() < koordinat.getsonX())
			   {
		             while(girdi!=true && (tahta.tahta[a+1][b+1]==' ' || Character.isUpperCase(tahta.tahta[a+1][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a+1)))
		                  {
		        	 
		                    	 if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a+1 && Character.isUpperCase(tahta.tahta[a+1][b+1])==false) 
		                    	      {
		        	                      tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
	        		                      tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
	        		                      girdi=true;
	        		                      break;
		        	                  }
		        	     a=a+1; b=b+1;
		                  }
			   }
		         
			     a=koordinat.getbasY();
			     b=koordinat.getbasX(); 
		         
		      // dikey yukarý    
		         
			     if( girdi!=true && koordinat.getsonY() < koordinat.getbasY() && koordinat.getbasX()==koordinat.getsonX())
				 {
		               while(girdi!=true &&  (tahta.tahta[a-1][b]==' ' ||  Character.isUpperCase(tahta.tahta[a-1][b])!=true || (koordinat.getsonX()==b && koordinat.getsonY()==a-1 )))
		                     {
		        	              if(koordinat.getsonX()==b && koordinat.getsonY()==a-1 && Character.isUpperCase(tahta.tahta[a-1][b-1])==false)
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
			            while(girdi!=true &&  (tahta.tahta[a+1][b]==' ' || Character.isUpperCase(tahta.tahta[a+1][b])!=true || (koordinat.getsonX()==b && koordinat.getsonY()==a+1 )))
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
			           while(girdi!=true &&  (tahta.tahta[a][b-1]==' ' || Character.isUpperCase(tahta.tahta[a][b-1])!=true || (koordinat.getsonX()==b-1 && koordinat.getsonY()==a )))
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
			          while(girdi!=true &&  (tahta.tahta[a][b+1]==' ' || Character.isUpperCase(tahta.tahta[a][b+1])!=true || (koordinat.getsonX()==b+1 && koordinat.getsonY()==a )))
		                   {
		        	           if(koordinat.getsonX()==b+1 && koordinat.getsonY()==a && Character.isUpperCase(tahta.tahta[a][b+1])==false)
		        	               {
		        		               tahta.tahta[koordinat.getsonY()][koordinat.getsonX()]=tahta.tahta[koordinat.getbasY()][koordinat.getbasX()];
		        		               tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
		        	                   girdi=true;
		        		               break;
		        	               } 
		        	             b=b+1; 
	     	                }
				 }
			     
		            tahta.yazdir(); System.out.println();	
			
		}
			
		
		
	}

}
