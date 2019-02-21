import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		Statement stmt;
		ResultSet rs;
		int cnt=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels", "root", "rajitha");
			
			//Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			//ResultSet rs=stmt.executeQuery("select * from offices");
			String str="insert into offices values('121','Banglore','+91 650 219 3456 ' , 'dilshad' , 'Utili Building' ,'KA','INDIA','56001','NA')";
			stmt=con.createStatement();
			int rowcount=stmt.executeUpdate(str);
			if(rowcount>0)
			{
				System.out.println("record inserted successfully");
				
			}
			String str1="select count(officeCode)from offices";
			rs=stmt.executeQuery(str1);
			while(rs.next())
			{
				
				cnt=rs.getInt(1);
			}
			System.out.println("total no of records is: " +cnt);
			con.close();
			
				
					
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
}


