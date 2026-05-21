package iotopic.charorientedway;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		
		FileReader fr = null;
		
		try 
		{
			fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\25EH_GEN-40_FULL DAY_HMT\\hmt3.txt");
		
			int temp;
			
			while( (temp = fr.read()) != -1) 
			{
				sb.append((char)temp);
			}
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}finally 
		{
			try 
			{
				fr.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Final String : " + sb);
	}
}
