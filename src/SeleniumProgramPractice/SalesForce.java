package SeleniumProgramPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		Thread.sleep(5000);
		//here we will get error as there is a space in the class name. 
		//driver.findElement(By.className("button r4 wide primary")).click();//Error
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		//for class name=we can give tagname.classname
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
		

	}

}
