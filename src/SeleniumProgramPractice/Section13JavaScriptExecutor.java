package SeleniumProgramPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section13JavaScriptExecutor {
	// Enter the letters BENG
	// Verify if Airport option is displayed in the suggestive box

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(2000);

       driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
        //driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
        //driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
 //it will not print the text.
       
		System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
       
     //Javascript DOM can extract hidden elements
     //because selenium cannot identify hidden elements - (Ajax implementation)
     //investigate the properties of object if it have any hidden text
       JavascriptExecutor js= (JavascriptExecutor)driver;
       //to retrieve the value we will use return-Here value will be returned and stored in the script.
             String script="return document.getElementById(\"fromPlaceName\").value;";
         String text   = (String) js.executeScript(script);
         System.out.println(text);
         
         //to check for BENGALURU INTERNATION AIRPORT
         //if we give invalid name, the while loop will not stop.it will continue to check.
         //to make it stop , we will put the condition as for maxi,um 10 times it will check the value
         int i=0;
         while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
         {
        	 driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
        	 text   = (String) js.executeScript(script);
        	 System.out.println(text);
        	 i++;
        	 if(i>10)
        	 {
        		 break;
        	 }
        	 }
         if(i>10)
         {
         System.out.println("Element not found");
         }
         else
         {
         System.out.println("Element  found");
         }
driver.close();
         
       
		
	}
}
	


