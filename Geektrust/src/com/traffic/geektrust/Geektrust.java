package com.traffic.geektrust;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import com.traffic.geektrust.FetchDataFromFile;

public class Geektrust
{
	static int  ORBIT1CRATO=18;
	static int ORBIT2CRATO=20;	
	static double ORBIT1DISTANCE=18;
    static double ORBITDISTANCE=20;

	public static double getORBIT1DISTANCE()
	{
		return ORBIT1DISTANCE;
	}

	public static double getORBITDISTANCE() 
	{
		return ORBITDISTANCE;
	}

	public static void main (String[] args) throws IOException
	{
		
		
        //		Fetch SEASON ORBIT 1 Speed and ORBIT 2 Speed from file passed by user
		
		FetchDataFromFile fd= new FetchDataFromFile();
		String ips[]=fd.returnUserInput("userInput.txt");
		String  userInputSeason=ips[0];
		double  userInputOR1speed=Float.parseFloat(ips[1]);
		double  userInputOR2speed=Float.parseFloat(ips[2]);
		
		
		// Calculate crator count depending upon wheather
		
		CalculateCrator cc= new CalculateCrator();
		int cratorCount[]=cc.returnCratorNum(userInputSeason,ORBIT1CRATO , ORBIT2CRATO);		
		int seasonCratorOR1=cratorCount[0];
		int seasonCratorOR2=cratorCount[1];

		// CALCULATE POSSIBLE VEHIVLE EPENDING UPON SEASON 
		List l;
		ReturnVehicles rv= new ReturnVehicles();
		l= rv.returnPossibleVehicle(userInputSeason);
		
		CalculateOrbitTravelTime ott= new CalculateOrbitTravelTime();
		ott.returnTravelTime(l,userInputOR1speed,userInputOR2speed);
		
		
	}
}
	
	

;