package SeleniumProgramPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section13AutoSuggestiveDropDownMakemyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		 //in place of writing multiple times,
		/*driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.id("fromCity")).sendKeys("mum");
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).sendKeys(Keys.ENTER);*/
          //folow the below procedure
		
	/*WebElement source	=driver.findElement(By.id("fromCity"));
	          source.click();
	          source.sendKeys("MUM");
	          Thread.sleep(2000);
	          source.sendKeys(Keys.ENTER);*/
	          
	          WebElement destination= driver.findElement(By.id("toCity"));
	          destination.click();
	           destination.sendKeys("DEL");
	            Thread.sleep(2000);
	            destination.sendKeys(Keys.ARROW_DOWN);
	            destination.sendKeys(Keys.ENTER);
	                       
	                       

		

		


	}

}
