package MyCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class PrePareStatement {

	public static void main(String[] args) 
	{
		String url="jdbc:h2:tcp://localhost/~/nam";
		String username="sa";
		String password="";
		String str="insert into Employees (ID,NAME,ADDRESS) values (?,?,?)";  
		try
		{
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement stmt=  con.prepareStatement(str);
		
	
			 stmt.setInt(1,101);//1 specifies the first parameter in the query  
			  stmt.setString(2,"Ratan"); 
			 stmt.setString(3,"MALAD");
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			  
			con.close();  
			  
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			}  
		
			  
			}

	
		

	}

