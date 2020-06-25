package SeleniumProgramPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataBaseProgram {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
		/*Connection conc		=DriverManager.getConnection(
				"jdbc:mysql://"+host+" :"+port+"/employeeTcs", "root", "admin123");*/
		
		

Connection conc=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/java", "root", "admin123");

		
       Statement s =conc.createStatement();

       
ResultSet rs =s.executeQuery("select * from employeeTcs where location='new york'");
while(rs.next())
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://login.salesforce.com");
            System.out.println(rs.getString("location"));

	}
	}
}
