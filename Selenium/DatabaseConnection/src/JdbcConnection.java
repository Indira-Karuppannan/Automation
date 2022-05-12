import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost\\MSSQLSERVER:1433;DatabaseName=qadbt;user=LAPTOP-VHB53090\\rajus;password=password");
	    Statement s=conn.createStatement();
	    ResultSet res=s.executeQuery("select * from credentials where scenario ='zerobalancecard'");
	    res.next();
	    System.out.println(res.getString("username"));
	    System.out.println(res.getString("password"));
	}

}
