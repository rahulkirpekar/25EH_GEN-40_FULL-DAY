package jdbctopic.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	// 1. Make Credentials
	private static final String URLNAME     = "jdbc:mysql://localhost:3306/25EH_GEN_40_FULLDAY_HMT_DB";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME    = "root";
	private static final String PASSWORD	= "root";	

	// 2. Create Db Connection Method
	public static Connection getConnection() 
	{
		Connection conn = null;
		try 
		{
			//3. Load Driver Class
			Class.forName(DRIVERCLASS);
			
			// 4. Pass credentials into DriverManager's getConnection Method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}	
		return conn;
	}
//	public static void main(String[] args) 
//	{
//		Connection conn = DBConnection.getConnection();
//		
//		// 5. validate conn object
//		if(conn != null) 
//		{
//			System.out.println("Db Connected : " + conn);
//		}else 
//		{
//			System.out.println("Db not Connected : " + conn);
//		}
//	}
}
