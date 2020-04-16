package com.traffic.geektrust;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FetchDataFromFile
{

	public String[] returnUserInput(String fileName) throws FileNotFoundException
	{
		String userData[]= new String[3] ;
		FileInputStream f= new FileInputStream(fileName);
		Scanner sc= new Scanner(f);
		String l=sc.nextLine();
		StringTokenizer st= new  StringTokenizer(l);
		int count=st.countTokens();
		String season="";
		int or1Speed=1;
		int or2Speed=1;
		while (count>0)
		{
			String s= st.nextToken().toString();			
			if (count==3) season=s;
			if (count==2) or1Speed=Integer.parseInt(s);
			if (count==1) or2Speed=Integer.parseInt(s);			
			count--;
		}
	
		userData[0]=season;
		userData[1]=String.valueOf(or1Speed); 
		userData[2]=String.valueOf(or2Speed);
		
		return userData;
		
	}

	
	
	
}
