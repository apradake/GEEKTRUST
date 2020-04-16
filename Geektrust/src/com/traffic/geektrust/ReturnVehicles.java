package com.traffic.geektrust;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReturnVehicles 
{

	public  List returnPossibleVehicle(String season)
	{
		
		List<String> l= new  ArrayList<>();
		
		
		if (season.equalsIgnoreCase("SUNNY"))
		{
			l.add("BIKE");
			l.add("TUKTUK");
			l.add("SUPERCAR");
			
			
		}
		
		if (season.equalsIgnoreCase("RAINY"))
		{

		
			l.add("TUKTUK");
			l.add("SUPERCAR");
			
			
		}
		if (season.equalsIgnoreCase("WINDY"))
		{
			

			l.add("BIKE");
			l.add("SUPERCAR");
			
					
		}
		
		return  l;
	}
	
}
