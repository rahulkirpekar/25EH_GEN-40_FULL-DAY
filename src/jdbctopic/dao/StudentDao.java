package jdbctopic.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

// StudentDao---Student Table Operation
public class StudentDao 
{
	public int insertStudent(StudentBean sbean) 
	{
		int rowsAffected = 0;
		Statement stmt = null;
		
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES('"+ sbean.getName() +"',"+ sbean.getStd() +","+ sbean.getMarks() +")";
		
		System.out.println("insertQuery : " + insertQuery);
		
		// 1. get Connection
		Connection conn = DBConnection.getConnection();
		
		// 2. validate connection object
		if (conn != null) 
		{
			try 
			{
				// 3. create statement object
				stmt = conn.createStatement();			

							// 4. execute SQL queries
				rowsAffected = stmt.executeUpdate(insertQuery);
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao : insertStudent()  Db not connected");
		}
		return rowsAffected;
	}
	public void updateStudent() 
	{
	}
	public void deleteStudent() 
	{
	}
	public void getAllRecords() 
	{
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Student Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Student Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.insertStudent(sbean);
		
		if(rowsAffected > 0) 
		{
			System.out.println("Student record successfully inserted : " + rowsAffected);
		}else 
		{
			System.out.println("Student record not inserted : " + rowsAffected);
		}
	}
}