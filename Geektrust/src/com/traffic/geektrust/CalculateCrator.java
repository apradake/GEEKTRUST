package com.traffic.geektrust;
import com.traffic.geektrust.*;

public class CalculateCrator 
{

	public int[] returnCratorNum(String wheather, int or1Count, int or2Count)
	{
		int cratorNum[]= new int[2];
		int or1Crator,or2Crator;		
		if (wheather.equalsIgnoreCase("SUNNY"))
		{
			or1Crator=(int) (or1Count*0.9);
			or2Crator=(int) (or2Count*0.9);
			cratorNum[0]=or1Crator;
			cratorNum[1]=or2Crator;		
		}		
		if (wheather.equalsIgnoreCase("RAINY"))
		{			
			or1Crator=(int) (or1Count*1.2);
			or2Crator=(int) (or2Count*1.2);
			cratorNum[0]=or1Crator;
			cratorNum[1]=or2Crator;			
		}		
		if (wheather.equalsIgnoreCase("WINDY"))
		{	
			cratorNum[0]=or1Count;
			cratorNum[1]=or2Count;			
		}	
		return cratorNum;
	}
	
}
