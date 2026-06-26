package jdbctopic.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import iotopic.byteorientedway.seri.Student;
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

	public int updateStudent(StudentBean sbean , int rno) 
	{
		String updateQuery = "UPDATE student SET name='"+sbean.getName()+"',std="+sbean.getStd()+",marks="+sbean.getMarks()+" WHERE rno="+rno;

		System.out.println("updateQuery : " + updateQuery);
		
		Connection conn = DBConnection.getConnection();

		Statement stmt = null;
		
		int rowsAffected =0 ;
		
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowsAffected = stmt.executeUpdate(updateQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao - updateStudent() Db not connected");
		}
		return rowsAffected;
	}
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE rno = " + rno;
		
		Connection conn = DBConnection.getConnection();
		
		Statement stmt = null;
		
		int rowsAffected = 0 ;
		
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowsAffected = stmt.executeUpdate(deleteQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao - deleteStudent() : Db not connected");
		}
		return rowsAffected;
	}

	public ArrayList<StudentBean> getAllRecords() 
	{
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();

		String selectQuery = "SELECT * FROM student";
		
		Connection conn = DBConnection.getConnection();
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		StudentBean sbean  = null;
		
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rs = stmt.executeQuery(selectQuery);
				
				while(rs.next()) 
				{
					int rno = rs.getInt(1);
					
					String name = rs.getString(2);
					
					int std = rs.getInt(3);
					
					int marks = rs.getInt(4);
					
//					System.out.println(rno+" " + name+" " + std + " " +marks);
					
					sbean  = new StudentBean(rno, name, std, marks);

					list.add(sbean);
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao getAllStudent() Db not connetced");
		}
		return list;
	}

	public StudentBean getStudentByName(String name) 
	{
		String selectStudentByNameQuery = "SELECT * FROM student WHERE name LIKE '"+name+"'";
		System.out.println("selectStudentByNameQuery : " + selectStudentByNameQuery);
		StudentBean sbean = null;
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rs = stmt.executeQuery(selectStudentByNameQuery);
				
				if(rs.next()) 
				{
					int rno = rs.getInt(1);
					String name1= rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);
					sbean  = new StudentBean(rno, name1, std, marks);
				}
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("Db not connected ");
		}
		return sbean;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name Which you want to SEARCH : ");
		String name = sc.nextLine();
		
		StudentDao dao = new StudentDao(); 
		
		StudentBean sbean = dao.getStudentByName(name);
		
		if (sbean != null) 
		{
			System.out.println(sbean.getRno()+" " + sbean.getName()+" " + sbean.getStd()+" " + sbean.getMarks());
		} else 
		{
			System.out.println("Student record not found");
		}
/*		
		---------- DISPLAY ALL STUDENT ---------------
		ArrayList<StudentBean> list = dao.getAllRecords();
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = list.get(i);
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd() +" " + s.getMarks());
		}
		---------- DELETE STUDENT ---------------
		
		System.out.println("Enter Student Rno Which you want to Update record : ");
		int rno = sc.nextInt();
		sc.nextLine();		
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Student Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Student Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.updateStudent(sbean,rno);
		
		if(rowsAffected > 0) 
		{
			System.out.println("Student record successfully Updated : " + rowsAffected);
		}else 
		{
			System.out.println("Student record not Updated : " + rowsAffected);
		}
		
		---------- DELETE STUDENT ---------------
		System.out.println("Enter Student Rno : ");
		int rno = sc.nextInt();
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.deleteStudent(rno);
		
		if(rowsAffected > 0) 
		{
			System.out.println("Student record successfully Deleted : " + rowsAffected);
		}else 
		{
			System.out.println("Student record not Deleted : " + rowsAffected);
		}
		---------- INSERT STUDENT ---------------
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
*/		
	}
}