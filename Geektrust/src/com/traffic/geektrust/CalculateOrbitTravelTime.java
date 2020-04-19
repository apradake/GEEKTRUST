package com.traffic.geektrust;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.traffic.geektrust.*;


public class CalculateOrbitTravelTime
{
	 final float BIKESPEED=10;
	 final float TUKTUKSPEED=12;
 	 final float SUPERCARSPEED=20;
 	 

	public String[] returnTravelTime(List vList, double inpForOrbit, double cratorsNum)
	{
		String[] timeAndvehicle= new String[3];
		double vehicleSpeed;
		Geektrust gk= new Geektrust();
						
		Iterator it= vList.iterator();
		Map<Double,String> mapDat = new TreeMap(); 
		
		
		
		
	      while(it.hasNext())
	      {
	       
	    	  				String vehicle=(String) it.next();
	    	  			
							if (vehicle.equalsIgnoreCase("tuktuk"))			
							{
								if (TUKTUKSPEED>inpForOrbit){vehicleSpeed=inpForOrbit;}
								else{ vehicleSpeed=TUKTUKSPEED;}
								double timeForTravel=gk.ORBIT1DISTANCE/vehicleSpeed*60;
								double cratorTime=cratorsNum*1;
								double finalTime=timeForTravel+cratorTime;
								System.out.println("By TUKTUK is "+finalTime+" Mins");
								mapDat.put(finalTime,"TUKTUK");
								
							}
							else  if (vehicle.equalsIgnoreCase("bike"))			
							{
								if (BIKESPEED>inpForOrbit){vehicleSpeed=inpForOrbit;}
								else{vehicleSpeed=BIKESPEED;}
								double timeForTravel=gk.ORBIT1DISTANCE/vehicleSpeed*60;
								double cratorTime=cratorsNum*2;
								double finalTime=timeForTravel+cratorTime;
								System.out.println("By BIKE is "+finalTime+" mins");
								mapDat.put(finalTime,"BIKE");						}
							else
							{
								if (SUPERCARSPEED>inpForOrbit){vehicleSpeed=inpForOrbit;}
								else{vehicleSpeed=SUPERCARSPEED;}
								double timeForTravel=gk.getORBIT1DISTANCE()/vehicleSpeed*60;
								double cratorTime=cratorsNum*3;
								double finalTime=timeForTravel+cratorTime;
								System.out.println("By SUPERCAR is "+finalTime+" mins");
								mapDat.put(finalTime,"SUPERCAR");
							}
							
		}
		
	      for (Map.Entry<Double, String> entry : mapDat.entrySet())  
	            System.out.println("Key = " + entry.getKey() +  
	                         ", Value = " + entry.getValue()); 

		
		
		return timeAndvehicle;
	}
}
