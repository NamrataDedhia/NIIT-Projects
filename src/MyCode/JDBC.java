package MyCode;
import java.sql.*;
public class JDBC {

	public static void main(String[] args) {
		String url="jdbc:h2:tcp://localhost/~/nam";
		String username="sa";
		String password="";
		String query="Select * from Employees";
		
		
		try(Connection c=DriverManager.getConnection(url, username, password);
				Statement stmt=c.createStatement();
				ResultSet rs1=stmt.executeQuery(query))
			
				{
			while(rs1.next())
			{
				String col1=rs1.getString(1);
				String col2=rs1.getString(2);
				String col3=rs1.getString(3);
				System.out.println(col1+" "+col2+" "+col3);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
