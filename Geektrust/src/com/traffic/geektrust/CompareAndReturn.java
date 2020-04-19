package com.traffic.geektrust;

import java.util.Arrays;
import java.util.List;

public class CompareAndReturn 
{

	public String returnBestCombi(double[] timearray1, String[] vehiclearray1 ,  double[] timearray2, String[] vehiclearray2 )
	{
		String returnVal="";
		double finalAns;
		double[] temp1=timearray1;
		double[] temp2=timearray2;
		double ORBIT_1;
		double ORBIT_2;
		Arrays.sort(timearray1); Arrays.sort(timearray2);
		ORBIT_1=timearray1[0];
		ORBIT_2=timearray2[0];
	
		
		
		if (ORBIT_1>ORBIT_2)
		{
			int index=findIndex(temp2, ORBIT_2);
			String veh=vehiclearray2[index];
			
			returnVal+=veh+" ORBIT2";
		}
		else
		{
			int index=findIndex(temp1, ORBIT_1);
			String veh=vehiclearray1[index];
			returnVal+=veh+" ORBIT1";
		}
		
		
	
		
		
		return returnVal;
	}
	
	public static int  findIndex (double[] temp2, double oRBIT_2)
	{
        if (temp2 == null) return -1;
        int len = temp2.length;
        int i = 0;
        while (i < len) {
            if (temp2[i] == oRBIT_2) return i;
            else i=i+1;
        }
        return -1;
	}	
}
