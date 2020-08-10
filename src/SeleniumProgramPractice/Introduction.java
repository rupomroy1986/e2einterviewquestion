package SeleniumProgramPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("rupomroy");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		// normal way
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("Thisis my first code");
		driver.findElement(By.name("pass")).sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Forgotten account?")).click();

		// System.out.println(driver.getPageSource());

		// By Using Xpath:

		driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
		// driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();

		// driver.close();

	}

}
