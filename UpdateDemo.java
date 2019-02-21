import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con;
		//Statement stmt;
		PreparedStatement pstmt;
		ResultSet rs;
		int cnt=0;
		String sqlUpdate;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels", "root", "rajitha");
			sqlUpdate="update employees " + " set jobTitle = ? "+ "where employeeNumber = ?";
			pstmt = con.prepareStatement(sqlUpdate);
			Scanner s=new Scanner(System.in);
			System.out.println("enter employee id:");
			int eid=s.nextInt();
			System.out.println("enter new job title");
			String strm=s.next();
			
			pstmt.setString(1, strm);
			pstmt.setInt(2, eid);
			 int rowAffected =pstmt.executeUpdate();
			 System.out.println("row affected "+rowAffected);
			 
			 //REUSE THE PREPARED STATEMENT
			 strm="Sales head";
			 eid=1370;
			 pstmt.setString(1, strm);
			 pstmt.setInt(2, eid);
			 rowAffected=pstmt.executeUpdate();
			 System.out.println("row affected "+ rowAffected);
			 con.close();
			 
			 
			
	}catch(Exception e)
		{
			System.out.println(e);
			
		}
}
}
