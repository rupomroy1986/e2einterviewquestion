package SeleniumProgramPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAuthenticationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'You must have the')]")).getText());
		
		

	}

}
