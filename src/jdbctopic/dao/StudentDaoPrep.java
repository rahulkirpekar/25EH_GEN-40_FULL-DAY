package jdbctopic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
	public int updateStudent(StudentBean sbean , int rno) 
	{
		String updateQuery = "UPDATE student SET name=?,std=?,marks=? WHERE rno=?";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(updateQuery);
			
				pstmt.setString(1, sbean.getName());
				pstmt.setInt(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());
				pstmt.setInt(4, rno);
				
				System.out.println("pstmt : " + pstmt);
				
				rowsAffected = pstmt.executeUpdate();
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("Db not connected");
		}
		return rowsAffected;
	}
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE rno=?";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt =null;
		int rowsAffeected = 0;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(deleteQuery);
			
				pstmt.setInt(1, rno);
			
				System.out.println("pstmt : " + pstmt);
				
				rowsAffeected = pstmt.executeUpdate();
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("Db not connected");
		}
		return rowsAffeected;
	}
	public ArrayList<StudentBean> getAllRecords() 
	{
		String selectQuery = "SELECT * FROM student";
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		StudentBean s = null;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(selectQuery);
				
				rs = pstmt.executeQuery();
				
				while(rs.next()) 
				{
					int rno = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3); 
					int marks = rs.getInt(4);
					
					s = new StudentBean(rno, name, std, marks);
					
					list.add(s);
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao Db not connected");
		}
		return list;
	}
	
	public StudentBean getStudentByName(String name) 
	{
		String selectStudentByNameQuery = "SELECT * FROM student WHERE name=?";
		StudentBean sbean = null;
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(selectStudentByNameQuery);
				pstmt.setString(1, name);
				rs= pstmt.executeQuery();
				if(rs.next()) 
				{
					int rno = rs.getInt(1);
					String name1 = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);
					
					sbean = new StudentBean(rno, name1, std, marks);
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} 
		else 
		{
			System.out.println("StudentDao Db not connected");
		}
		return sbean;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Rno which you want to Update : ");
		int rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Student Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Student Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDaoPrep studentDao = new StudentDaoPrep();
		
		int rowsAffected = 	studentDao.updateStudent(sbean, rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Updated " + rowsAffected) ;
		} else 
		{
			System.out.println("Student record not Updated " + rowsAffected) ;
		}
		
/*		
		//---------------- SELECT Student BY NAME------------------
		System.out.println("Enter Student Name Which you want to Record : ");
		String name = sc.nextLine();

		StudentDaoPrep studentDao = new StudentDaoPrep();
		
		StudentBean s = studentDao.getStudentByName(name);

		if (s != null) 
		{
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
			
		} else 
		{
			System.out.println("Student record not found");
		}
		
		//---------------- SELECT Student ------------------
		StudentDaoPrep studentDao = new StudentDaoPrep();
		ArrayList<StudentBean> list = studentDao.getAllRecords();
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = list.get(i);
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		//---------------- DELETE Student ------------------
		System.out.println("Enter Student Rno which you want to Delete : ");
		int rno = sc.nextInt();
		
		StudentDaoPrep studentDao = new StudentDaoPrep();
		
		int rowsAffected = 	studentDao.deleteStudent(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Deleted " + rowsAffected) ;
		} else 
		{
			System.out.println("Student record not Deleted " + rowsAffected) ;
		}	
		---------------- INSERT Student ------------------
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
*/
	}
}
