package ptky18it4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MSSQLJDBCConnection {
public static Connection MSSQLJDBCConnection() {
	final String user = "ptky";
	final String password = "ptky18it4";
	final String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSinhVien;Username="+user+";Password ="+password;
	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url);	
	}catch(ClassNotFoundException e) {
		System.out.println("Class not found !");
	}catch(SQLException E) {
		System.out.println("Error");
	}
	return null;
}
public static void main(String[] args) {
	Connection connection = MSSQLJDBCConnection();
	if(connection != null) {
		System.out.println("Thanh cong !");
	}
	else {
		System.out.println("That bai !");
	}
}

}
