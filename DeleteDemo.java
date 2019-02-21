import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteDemo {
	
	public static void main(String[] args) {

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
		
		String sql="delete from offices where city='Banglore'";
		System.out.println(" ");
		stmt=con.createStatement();
		cnt=stmt.executeUpdate(sql);
		
		
		//int rowcount=stmt.executeUpdate(str);
		if(cnt>0)
		{
			System.out.println("record deleted");
			
		}
		con.close();
		
	

}
	catch(Exception e)
	{
		System.out.println(e);
		
	}
}
}
