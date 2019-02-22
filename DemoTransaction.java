import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DemoTransaction {
	
	public static void main(String[] ar)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc", "root", "rajitha");
		System.out.println("driver is loaded");
		Statement stmt=Con.createStatement();
		Con.setAutoCommit(false);
		try
		{
			int i1=stmt.executeUpdate("insert into candidate_skills values(21,3)");
			int i2=stmt.executeUpdate("update skills set name='ruby' where id=2");
			int i3=stmt.executeUpdate("delete from candidates where id=1");
			Con.commit();
			System.out.println("transaction is success");
			
		}
		catch(Exception e)
		{
			//System.out.println(e);
			try
			{
				Con.rollback();
				System.out.println("transaction is failed");
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
		stmt.close();
		Con.close();
		System.out.println("conn is closed");
		
		
	}
}
