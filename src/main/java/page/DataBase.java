//package page;
//
//import java.sql.Connection;
//
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import org.openqa.selenium.WebDriver;
//
//import com.mysql.cj.xdevapi.Statement;
//
//public class DataBase {
//
//	Connection connection;
//	Statement statement;
//	ResultSet resultSet;
//	String columnValue;
//
//	public String getDataFromDb(String columnName) {
//
//		try {
//
//			// create the properties for mySql
//			Class.forName("com.mysql.jdbc.Driver");
//			String sqlUsername = "student";
//			String sqlPassword = "Student@123";
//			String sqlUrl = "";
//			String sqlQuerry = "SELECT * FROM login_data;";
//
//			// create a connection to Db
//			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
//			statement = connection.createStatement();
//			resultSet = statement.execute(sqlQuerry);
//
//			while (resultSet.next()) {
//
//				columnValue = resultSet.getString(columnName);
//			}
//
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//
//		}
//		if (resultSet != null) {
//			try {
//				resultSet.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			if (connection != null) {
//				try {
//					connection.close();
//				}
//
//				catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//			
//			
//			
//			return columnValue;
//
//		}
//	}
//}
