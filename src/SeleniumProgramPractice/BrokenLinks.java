package SeleniumProgramPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// broken links means broken uRL
		// to get all the links from the footer links.
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a=new SoftAssert();
		for (WebElement link : links) {
			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

			/*
			 * conn.setRequestMethod("HEAD");
			 * 
			 * conn.connect();
			 */

			int respCode = conn.getResponseCode();

			System.out.println(respCode);
			//without using if condition
			a.assertTrue(respCode>400, "the links id broken" +link.getText() + " " + "the response code is" +respCode);
			
			/*if(respCode>400)
			{
				System.out.println("the link is broken" + " " +link.getText() + " " +"response code of the text is:" +respCode);
				//it is called as hard assertion
				Assert.assertTrue(false);
			}*/
		}
		a.assertAll();
         driver.close();

		/*System.out.println("for single links");
		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		System.out.println(url);

		// to get the broken links http code, it is not mandatory to write the below
		// commented line.without that also it will execute.
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		// conn.setRequestMethod("HEAD");
		// conn.connect();
		int responsecode = conn.getResponseCode();

		System.out.println("the response code for the single link is"+responsecode);


		driver.close();*/

	}

}
