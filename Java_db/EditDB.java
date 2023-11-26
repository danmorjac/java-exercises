package Java_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EditDB {
	public static void showDataBase(Statement sentence) throws SQLException {
		ResultSet rs =sentence.executeQuery("Select book_code,title,author from books");
		while (rs.next()) 
			System.out.println(rs.getString("book_code")+" "+rs.getString("title") + " by " + rs.getString("author"));
	}

		public static void main(String [] args) {

		Connection connection;
		String url="jdbc:mysql://127.0.0.1:4306/library"; // test is the DB name
		String user="root";
		String password="alumnoalumno";
		
		String insertquery="insert into books values ('5','Aprende a gankear','LoLeros','Spanish','Daniel',5,97)";
		String updatequery="update books set title=?,book_code=? where book_code=?";
		String deletequery="delete from books where book_code=?";
		
		
		String bookCode="5";
		String newtitle="Gankeos Manolo";
		String newBookCode="6";
		
		
		
		


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(url,user,password); 



			Statement sentence = connection.createStatement();
			PreparedStatement psinsert=connection.prepareStatement(insertquery);
			PreparedStatement psupdate=connection.prepareStatement(updatequery);
			PreparedStatement psdelete=connection.prepareStatement(deletequery);
			System.out.println();
			System.out.println("Original DB");
			System.out.println();
			showDataBase(sentence);
			
			System.out.println();
			System.out.println("Inserted DB");
			System.out.println();

			psinsert.execute();
			showDataBase(sentence);
			
			System.out.println();
			System.out.println("UPDATED DB");
			System.out.println();

			psupdate.setString(1, newtitle);
			psupdate.setString(2, newBookCode);
			psupdate.setString(3, bookCode);

			psupdate.execute();
			showDataBase(sentence);
			
			System.out.println();
			System.out.println("DELETED IN THE DB");
			System.out.println();
			
			psdelete.setString(1, newBookCode);

			
			psdelete.execute();
			showDataBase(sentence);
			
			
			
			
		

		} catch (Exception e) { 
			e.printStackTrace();
		}
	}
}