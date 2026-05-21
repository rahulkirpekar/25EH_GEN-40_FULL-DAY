package iotopic.byteorientedway;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();// ABC--65,66,67
		
		// String---convert into byteArray

		byte b[] = name.getBytes();
		
		// name---write----Textfile
	/*		
			1. File Connection
			
			2. process(write / read)
			
			3. file connection close
	*/		
		try 
		{
			//1. File Connection
			FileOutputStream fout = new FileOutputStream("hmt1.txt");
			
			//2. process(write / read)
			fout.write(b);
		
			// 3. File Connection Close
			fout.close();
			
			System.out.println("Success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}