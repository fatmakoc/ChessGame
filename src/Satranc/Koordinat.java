package Satranc;

public class Koordinat {

	private byte basX;
	private byte basY;
	private byte sonX;
	private byte sonY;
	
	//This functions for start coordinates
		
	public byte getbasX()
	{
		return basX;
	}
	
	public byte getbasY()
	{
		return basY;
	}
	
	public byte getsonX()
	{
		return sonX;
	}
	
	public byte getsonY()
	{
		
		return sonY;
	}
	

	//This functions for end coordinate
	
	public void setbasX(byte x)
	{
	  this.basX=x;	
	}

	public void setbasY(byte sonY)
	{
		this.basY=sonY;
	}
	
	public void setsonX(byte sonX)
	{
		this.sonX=sonX;
	}
	
	public void setsonY(byte sonY)
	{
		this.sonY=sonY;
	}
	
	
	
}
