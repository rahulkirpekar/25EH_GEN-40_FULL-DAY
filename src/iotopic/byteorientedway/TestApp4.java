package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		
		try 
		{
			FileOutputStream fout = new FileOutputStream("hmt2.txt");
			
			
			fout.write(name.getBytes());
		
			
			fout.close();
			
			
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\25EH_GEN-40_FULL DAY_HMT\\hmt2.txt");
			
			int temp;
			
			while(	(temp = fin.read()) != -1	) 
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

		String value = sb.toString();
		
		String[] words = value.split("\\s");
		
		System.out.println(sb);

		System.out.println("words length : " + words.length);
		 
	}

}
