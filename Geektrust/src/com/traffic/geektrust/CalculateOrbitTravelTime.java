package com.traffic.geektrust;

import java.util.Arrays;
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
     double speedList[];
	 String vehiclename[];
	
 	 

	public String[] returnTravelTime(List vList, double inpForOrbit, double cratorsNum)
	{
		String[] timeAndvehicle= new String[3];
		double vehicleSpeed;
		Geektrust gk= new Geektrust();
		int ArrayLen=vList.size();
		speedList= new double[ArrayLen];
		vehiclename= new String[ArrayLen];
						
		Iterator it= vList.iterator();
		
		
		int ind=0;
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
								
								speedList[ind]=finalTime;
								vehiclename[ind]="TUKTUK";
								
							}
							else  if (vehicle.equalsIgnoreCase("bike"))			
							{
								if (BIKESPEED>inpForOrbit){vehicleSpeed=inpForOrbit;}
								else{vehicleSpeed=BIKESPEED;}
								double timeForTravel=gk.ORBIT1DISTANCE/vehicleSpeed*60;
								double cratorTime=cratorsNum*2;
								double finalTime=timeForTravel+cratorTime;
								
								speedList[ind]=finalTime;
								vehiclename[ind]="BIKE";
													
							}
							else
							{
								if (SUPERCARSPEED>inpForOrbit){vehicleSpeed=inpForOrbit;}
								else{vehicleSpeed=SUPERCARSPEED;}
								double timeForTravel=gk.getORBIT1DISTANCE()/vehicleSpeed*60;
								double cratorTime=cratorsNum*3;
								double finalTime=timeForTravel+cratorTime;
								
								speedList[ind]=finalTime;
								vehiclename[ind]="SUPERCAR";
								
							}
							
							ind++;
		}
	    
		
	    
		
		
		return timeAndvehicle;
	}
	
	
	public double[] returnTimeArray()
	{
		
		return speedList;
	}
	
	public String[] returnVehiclesName()
	{
		return vehiclename;
	}
	
}
