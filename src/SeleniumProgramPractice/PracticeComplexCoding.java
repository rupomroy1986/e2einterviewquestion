package SeleniumProgramPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//important interview questions
public class PracticeComplexCoding {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		//count the number of links in a webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//limiting the number of links in a webpage
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));

		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//here we are finding the size of the 1st row.
		
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		//here we have to open the link in each of the tab.
		
	int count=	coloumndriver.findElements(By.tagName("a")).size();
	for(int i=1;i<count;i++)
	{
		           String clickinglink       =  Keys.chord(Keys.CONTROL,Keys.ENTER);
		coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickinglink);
		Thread.sleep(5000);
	}
		//here we are trying to switch to the different windows and trying to grap the title of that window.
		       Set<String> s1 = driver.getWindowHandles();
		    Iterator<String>   it  =    s1.iterator();
		                        while(it.hasNext())
		                        {
		                        	driver.switchTo().window(it.next());
		                        	System.out.println(driver.getTitle());
		                        }
		          }
     
	
	                               

	}


