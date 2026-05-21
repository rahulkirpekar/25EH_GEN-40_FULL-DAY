package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\25EH_GEN-40_FULL DAY_HMT\\hmt1.txt");

			// process---read from file
			int temp ;
			
			while(	(temp = fin.read())  !=	-1) 
			{
				sb.append((char)temp);
			}
			fin.close();
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Final String :  " + sb);
	}
}
