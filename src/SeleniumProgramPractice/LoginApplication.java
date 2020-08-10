package SeleniumProgramPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjects.RediffHomepage;
import PageObjects.RediffLoginPage;
import PageObjects.RediffLoginPageFactory;

public class LoginApplication {

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//using simple page object model
		RediffLoginPage rd=new RediffLoginPage(driver);
		/*rd.Emaild().sendKeys("hello");
		rd.Password().sendKeys("hello");
		rd.Home().click();*/
		/*RediffHomepage rh=new RediffHomepage(driver);
		rh.search().sendKeys("rediff");
		rh.submit().click();*/
		
		//Using page factory concept-Executing page object factory
		RediffLoginPageFactory rp=new RediffLoginPageFactory(driver);
		rp.Emaild().sendKeys("india");
		rp.Password().sendKeys("hello");
		rp.submit().click();
}
}