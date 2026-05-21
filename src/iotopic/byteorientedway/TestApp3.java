package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\25EH_GEN-40_FULL DAY_HMT\\src\\iotopic\\byteorientedway\\TestApp2.java");

			FileOutputStream fout  = new FileOutputStream("DupTestApp2.java");
			
			int temp;
			
			while( (temp = fin.read()) != -1) 
			{
				System.out.print((char)temp);
				fout.write(temp);
			}
		
			fin.close();
			fout.close();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
