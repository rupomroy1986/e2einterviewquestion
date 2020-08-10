package SeleniumProgramPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		
		      Set<String>  s1       = driver.getWindowHandles();
		              Iterator<String>    it     =s1.iterator();
		                         String parentId=  it.next();
		                            String childid  = it.next();
		                         driver.switchTo().window(childid);
		                         System.out.println(driver.getTitle());
		                         System.out.println("switching back again to the parent window");
		                         driver.switchTo().window(parentId);
		                         System.out.println(driver.getTitle());
		                         driver.quit();
		                           

	}

}
