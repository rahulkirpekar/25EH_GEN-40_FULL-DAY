package iotopic.byteorientedway.seri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		FileInputStream fin ;
		
		try 
		{
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\25EH_GEN-40_FULL DAY_HMT\\htm4.txt");
		
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Student s[]  = (Student[])oin.readObject();
			
			for (int i = 0; i < s.length; i++) 
			{
				System.out.println(s[i].getRno() + " " + s[i].getName() +" " + s[i].getStd() + " "  + s[i].getMarks());
			}
			fin.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}