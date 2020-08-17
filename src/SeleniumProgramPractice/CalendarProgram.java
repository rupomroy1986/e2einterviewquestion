package SeleniumProgramPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarProgram {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//clicking on the tab
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
				{
				driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
				}
		
		
		
		
		
		
	//selecting the date on the same month
		int count=driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equals("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		driver.close();
		
		

	}

}
