package Java_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestingDB {

	public static void main(String [] args) {

		Connection connection;
		String url="jdbc:mysql://127.0.0.1:4306/library"; // test is the DB name
		String user="root";
		String password="alumnoalumno";
//		String query="insert into members (member_code, name, fname) values ('33','Francisco','Franco');";
		String query="delete from members where member_code='33'";



		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(url,user,password); 
			Statement sentence=connection.createStatement();
			ResultSet rs = sentence.executeQuery("select * from students");
			sentence.execute(query); 
			while (rs.next()) { 
				System.out.println(rs.getInt("name") + " " + rs.getString("fname")); 
			} 
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}
}