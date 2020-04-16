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

	public static void main (String[] args) throws IOException
	{
		
		
		/************************************************************/
		int ORBIT1CRATO=18;
		int ORBIT2CRATO=20;	

        //		Fetch SEASON ORBIT 1 Speed and ORBIT 2 Speed from file passed by user
		
		FetchDataFromFile fd= new FetchDataFromFile();
		String ips[]=fd.returnUserInput("userInput.txt");
		String  userInputSeason=ips[0];
		int  userInputOR1speed=Integer.parseInt(ips[1]);
		int  userInputOR2speed=Integer.parseInt(ips[2]);
		
		// Calculate crator count depending upon wheather
		
		CalculateCrator cc= new CalculateCrator();
		int cratorCount[]=cc.returnCratorNum(userInputSeason,ORBIT1CRATO , ORBIT2CRATO);		
		int seasonCratorOR1=cratorCount[0];
		int seasonCratorOR2=cratorCount[1];

		// CALCULATE POSSIBLE VEHIVLE EPENDING UPON SEASON 
		List l;
		ReturnVehicles rv= new ReturnVehicles();
		l= rv.returnPossibleVehicle(userInputSeason);
		System.out.println(l);
		
		
	}
}
	
	

;