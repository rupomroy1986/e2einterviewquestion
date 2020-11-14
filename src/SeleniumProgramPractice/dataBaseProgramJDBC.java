package SeleniumProgramPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataBaseProgramJDBC {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
		/*Connection conc		=DriverManager.getConnection(
				"jdbc:mysql://"+host+" :"+port+"/employeeTcs", "root", "admin123");*/
		
		

//Connection conc=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/java", "root", "admin123");
Connection conc=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "admin123");


		
       Statement s =conc.createStatement();

       
ResultSet rs =s.executeQuery("select * from employeeTcs where location='new york'");
//if the 1st index is present then only pick the values. If you dont give rs.next it will point to the base index, which will lead to wrong results.
while(rs.next())
{
	System.setProperty("webdriver.chrome.driver","C:\\Cucumber Latest\\83\\86\\chromedriver_win32 (2)\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://login.salesforce.com");
            System.out.println(rs.getString("location"));
            driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("location"));
            driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("Id"));

	}
	}
}
