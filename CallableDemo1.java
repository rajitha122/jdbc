import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.concurrent.Callable;

//import com.mysql.cj.jdbc.CallableStatement;

public class CallableDemo1 {

	
		// TODO Auto-generated method stub
		Connection Con;
		CallableStatement cstmt;
		CallableDemo1()
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
				
			
			
			public  void getSkills(int candidateId)
			{
				String query= " {call get_candidate_skill(?)}";
				ResultSet rs;
				try {
					
					
				
					CallableStatement stmt=  Con.prepareCall(query);
					stmt.setInt(1, candidateId);
					rs=stmt.executeQuery();
					while(rs.next())
					{
						System.out.println(String.format("%s -%s", rs.getString("first_name") + " "+rs.getString("last_name"),rs.getString("skill")));
						
					}
					
					
				}
				catch(SQLException ex)
				{
					System.out.println(ex.getMessage());
					
				}
				
			}
			public static void main(String[]  arg)
			{
				CallableDemo1 cd1=new CallableDemo1();
				cd1.createConnection();
				cd1.getSkills(133);
				
			}
			
	}

	