package collegeapplication.common;

import java.sql.*;

/*
 * Title : DataBaseConnection.java

 * Purpose : For database connection
 
 */

public class DataBaseConnection {
	
	static Connection con=null;
	static final String url="jdbc:mysql://uns.cwqg1mmsutrc.us-east-1.rds.amazonaws.com:3306/uns?useSSL=false&autoReconnect=true&verifyServerCertificate=false";
	static final String uname="admin";
	static final String password="gauravHS7";
	
	
	public static Connection getConnection()
	{
		if(con!=null)
		{
			return con;
		}
		else
		{
			try
			{
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection(url,uname,password);
				//jdbc:mysql://uns.cwqg1mmsutrc.us-east-1.rds.amazonaws.com:3306/uns?user=admin&password=gauravHS7
				return con;
			}
			catch(Exception exp)
			{
				exp.printStackTrace();
				return con;
			}
		}
	}
	public static boolean checkconnection() 
	{
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,uname,password);
			return true;
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
			return false;
		}
	}
	public static void  closeConnection() 
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
