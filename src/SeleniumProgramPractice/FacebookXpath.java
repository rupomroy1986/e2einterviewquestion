package SeleniumProgramPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");

		//// tagName[@attribute='value'] - xpath
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("myown xpath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		// tagName[attribute='value'] -CSS

		/*driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncss");
		driver.findElement(By.cssSelector("[value='Log In']")).click();*/

	}

}
