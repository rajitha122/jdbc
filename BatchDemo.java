import java.sql.*;
public class BatchDemo {
	
	Connection Con;
	Statement stmt;
	BatchDemo()
	{
		
	}
	void createConnection()
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc", "root", "rajitha");
				
			}
		
			catch(Exception e)
			{
				System.out.println(e);
			}	
		}
			
	void createBatch() throws SQLException  
	{
		stmt=Con.createStatement();
		
		stmt.addBatch("Update skills set name ='computer' where id=3; ");
		stmt.addBatch("delete from skills where name='Mobile App'");
		Con.setAutoCommit(false);
		
		try {
			 int i[]=stmt.executeBatch();
			 Con.commit();
			 System.out.println("BATCH SUCCESSFULLY EXECUTED");
			 
		}
		catch(Exception e)
		{
			System.out.println("batch failed");
		}
		
	}
	
	public static void main(String[]  arg) throws SQLException
	{
		 BatchDemo bd1=new  BatchDemo();
		bd1.createConnection();
		bd1.createBatch();
	}
	
	
}

