package SeleniumProgramPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Databases {

	public static void main(String[] args) throws SQLException, InterruptedException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port= "3306";
		//connection to mysql databases
		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "admin123");
		Statement s=con.createStatement();
		ResultSet rs      = s.executeQuery("select * from employeeinfo where id=1");
		while(rs.next())
		{
		System.out.println(rs.getString("location"));
         System.out.println(rs.getInt("age"));
         System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("https://login.salesforce.com");
 		Thread.sleep(2000);

 		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("location"));

 		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("age"));
	}
	}

}
