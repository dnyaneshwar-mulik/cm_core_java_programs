package jdbc_pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentCRUD {

	void selectStudent() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmdb", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while (rs.next()) {
				System.out
						.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	void insertStudent() {

		Connection con = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmdb", "root", "root");

			Statement stmt = con.createStatement();

			stmt.execute("insert into student values ('2','jack','22', '990564215')");

			System.out.println("Student Inserted Successfully");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

	/*
	 * void updateStudent() {
	 * 
	 * Connection con = null;
	 * 
	 * try {
	 * 
	 * Class.forName("com.mysql.cj.jdbc.Driver");
	 * 
	 * con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmd", "root",
	 * "root");
	 * 
	 * Statement stmt = con.createStatement();
	 * 
	 * stmt.execute("update student set age='35' where rno='2' ");
	 * 
	 * System.out.println("Student updated Successfully");
	 * 
	 * } catch (ClassNotFoundException e) {
	 * 
	 * e.printStackTrace(); } catch (SQLException e) {
	 * 
	 * e.printStackTrace(); }finally { try { con.close(); } catch (SQLException e) {
	 * 
	 * e.printStackTrace(); } }
	 * 
	 * }
	 */

	public static void main(String[] args) {

		StudentCRUD obj = new StudentCRUD();
		// obj.updateStudent();
		obj.selectStudent();
		// obj.insertStudent();
	}

}
