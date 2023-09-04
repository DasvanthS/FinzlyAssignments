package jdbcAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbk1", "student", "student");
		
//		PreparedStatement st = con.prepareStatement("insert into login values(?,?,?)");
//		st.setInt(1, 4);
//		st.setString(2, "xxx");
//		st.setString(3, "120931");
		
//		PreparedStatement st = con.prepareStatement("update login set username = ? where id = ?");
//		st.setString(1, "yyy");
//		st.setInt(2, 4);
		
		PreparedStatement st = con.prepareStatement("delete from login where id = ?");
		st.setInt(1, 4);
		
		st.executeUpdate();
		
		ResultSet rs = st.executeQuery("Select * from login");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +rs.getString(3));
		}
		

	}

}
