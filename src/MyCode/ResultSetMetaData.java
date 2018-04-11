package MyCode;
import java.sql.ResultSet;
import java.sql.*;
public class ResultSetMetaData {

	public static void main(String[] args) {
		
			String url="jdbc:h2:tcp://localhost/~/nam";
				String username="sa";
				String password="";
				String query="select * from employees";  
				try(Connection con = DriverManager.getConnection(url,username,password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query))
				{
				java.sql.ResultSetMetaData rsmd =  rs.getMetaData();
				System.out.println("Total columns: "+ rsmd.getColumnCount());
				System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
				System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));

				con.close();  
				}
				catch(Exception e)
				{
				 System.out.println(e);
				}  

}
}
