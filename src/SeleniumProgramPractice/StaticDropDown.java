package SeleniumProgramPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//this code will not get executed as because the UI is changed
public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
		Select s1=new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult")));
		s1.selectByValue("3");
		s1.selectByIndex(4);
		s1.selectByVisibleText("7");
		
		

	}

}
