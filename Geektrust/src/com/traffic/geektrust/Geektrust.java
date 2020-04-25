package com.traffic.geektrust;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import com.traffic.geektrust.FetchDataFromFile;

public class Geektrust
{
	static int  ORBIT1CRATO=20;
	static int ORBIT2CRATO=10;	
	static double ORBIT1DISTANCE=18;
    static double ORBIT2DISTANCE=20;

	public static double getORBIT1DISTANCE()
	{
		return ORBIT1DISTANCE;
	}

	public static double getORBIT2DISTANCE() 
	{
		return ORBIT2DISTANCE;
	}

	public static void main (String[] args) throws IOException
	{
		
		
        //		Fetch SEASON ORBIT 1 Speed and ORBIT 2 Speed from file passed by user
		
		FetchDataFromFile fd= new FetchDataFromFile();
		String ips[]=fd.returnUserInput("userInput.txt");
		String  userInputSeason=ips[0];
		double  userInputOR1speed=Float.parseFloat(ips[1]);
		double  userInputOR2speed=Float.parseFloat(ips[2]);
	
	//	System.out.println("OR1 input"+ userInputOR1speed);
	//	System.out.println("OR2 input"+ userInputOR2speed);
		
		
		// Calculate crator count depending upon wheather
		
		CalculateCrator cc= new CalculateCrator();
		int cratorCount[]=cc.returnCratorNum(userInputSeason,ORBIT1CRATO , ORBIT2CRATO);		
		int seasonCratorOR1=cratorCount[0];
		int seasonCratorOR2=cratorCount[1];
		// CALCULATE POSSIBLE VEHIVLE DEPENDING UPON SEASON 
		
		List l;
		ReturnVehicles rv= new ReturnVehicles();
		l= rv.returnPossibleVehicle(userInputSeason);

		
		//CALCULATING TIME FOR EACH VEHICLE ACCORDING TO SEASON
		CalculateOrbitTravelTime ott= new CalculateOrbitTravelTime();
		ott.returnTravelTime(l,userInputOR1speed,seasonCratorOR1 ,"one");
		
		double[] t1=ott.returnTimeArray();
		String[] v1=ott.returnVehiclesName();
		
		
		ott.returnTravelTime(l,userInputOR2speed,seasonCratorOR2,"two");
		double[] t2=ott.returnTimeArray();
		String[] v2=ott.returnVehiclesName();

		
		CompareAndReturn cr= new CompareAndReturn();
		String result=cr.returnBestCombi(t1, v1, t2, v2);
		System.out.println(result);
		 
		
		
		
	}
}
	
	

;