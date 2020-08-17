package SeleniumProgramPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//selecting the departure city
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
       Thread.sleep(2000);
       //selecting the arrival city
     //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	//based on the current date on the websites
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	//checking whether the return date is enabled or disabled.
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	{
     System.out.println("its enabled");
     Assert.assertTrue(true);
     }
	else
{
  Assert.assertTrue(false);
 }
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	//static drop down
	driver.findElement(By.id("divpaxinfo")).click();
	Select s1=new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult")));
	s1.selectByVisibleText("7");
	
	//count the number of checkboxes
	
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
			
			//different ways of writing the css for the search button.
			
			// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

			driver.findElement(By.cssSelector("input[value='Search']")).click();

			// driver.findElement(By.xpath("//input[@value='Search']")).click();

			// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

	

	

   
		
		
		//using parent child concept to select the drop down
		
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		// as enabled feature is not working for this website, so we have used the alternative method.
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		
		
		
	driver.close();		

	}

}
