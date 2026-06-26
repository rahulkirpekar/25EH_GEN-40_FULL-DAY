package jdbctopic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

public class StudentDaoPrep 
{
	public int insertStudent(StudentBean sbean) 
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES (?,?,?)";
		
		Connection conn = DBConnection.getConnection();

		PreparedStatement pstmt = null;
		
		int rowsAffected = 0;
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);
			
				pstmt.setString(1, sbean.getName());
				pstmt.setInt(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());
				
				System.out.println("pstmt : " + pstmt);
				
				rowsAffected = pstmt.executeUpdate();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("DB not connected");
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
	
	public void getStudentByName() 
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
		
		StudentDaoPrep studentDao = new StudentDaoPrep();
		
		int rowsAffected = 	studentDao.insertStudent(sbean);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Inserted " + rowsAffected) ;
		} else 
		{
			System.out.println("Student record not Inserted " + rowsAffected) ;
		}
	}
}
