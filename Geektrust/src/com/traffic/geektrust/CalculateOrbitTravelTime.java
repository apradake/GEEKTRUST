package com.traffic.geektrust;

import java.util.Iterator;
import java.util.List;
import com.traffic.geektrust.*;


public class CalculateOrbitTravelTime
{
	 final float BIKESPEED=10;
	 final float TUKTUKSPEED=12;
 	 final float SUPERCARSPEED=20;
 	 

	public String[] returnTravelTime(List vList, double userInpOr1Speed, double userInpOr2Speed)
	{
		String[] timeAndvehicle= new String[3];
		double vehicleSpeed;
		Geektrust gk= new Geektrust();
						
		Iterator it= vList.iterator();
		
	      while(it.hasNext())
	      {
	       
	    	  				String vehicle=(String) it.next();
	    	  			
							if (vehicle.equalsIgnoreCase("tuktuk"))			
							{
								if (TUKTUKSPEED>userInpOr1Speed){vehicleSpeed=userInpOr1Speed;}
								else{ vehicleSpeed=TUKTUKSPEED;}
								double timeForTravel=gk.ORBIT1DISTANCE/vehicleSpeed;
								System.out.println("Time by TUKTUk is "+timeForTravel+" hours");
								
							}
							else  if (vehicle.equalsIgnoreCase("bike"))			
							{
								if (BIKESPEED>userInpOr1Speed){vehicleSpeed=userInpOr1Speed;}
								else{vehicleSpeed=BIKESPEED;}
								double timeForTravel=gk.ORBIT1DISTANCE/vehicleSpeed;
								System.out.println("Time by BIKE is "+timeForTravel+" hours");
							}
							else
							{
								if (SUPERCARSPEED>userInpOr1Speed){vehicleSpeed=userInpOr1Speed;}
								else{vehicleSpeed=SUPERCARSPEED;}
								double timeForTravel=gk.getORBIT1DISTANCE()/vehicleSpeed;
								System.out.println("Time by SUPERCAR is "+timeForTravel+" hours");
							}
							System.out.println(vehicleSpeed);
		}
			
	     
		
		
		
		
		
		return timeAndvehicle;
	}
}
