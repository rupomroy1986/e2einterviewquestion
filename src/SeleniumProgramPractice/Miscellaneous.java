package SeleniumProgramPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;


import com.google.common.io.Files;

public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("asdf");
		
		driver.get("https://www.google.com");
		         File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		         FileUtils.copyFile(src,new File("C:\\Users\\rupom\\E2EPROJECT\\ProgramPractice\\src\\SeleniumProgramPractice\\rupom.png"));
		         
		
		
		

	}

}
