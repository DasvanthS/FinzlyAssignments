package jdbcAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk1", "student", "student");
		Statement st = con.createStatement();
		
//		st.executeUpdate("insert into login values(1, 'aaa', '12345') ");
//		st.executeUpdate("insert into login values(2, 'bbb', '67890') ");
//		st.executeUpdate("insert into login values(3, 'ddd', '67890') ");

		
//		st.executeUpdate("update login set username = 'ccc' where id = 2 ");
		
		st.executeUpdate("delete from login where id = 2 ");


		
		String query = "Select * from login";
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +rs.getString(3));
		}
		

	}

}
