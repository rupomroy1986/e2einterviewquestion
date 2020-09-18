package SeleniumProgramPractice;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AutoIt {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// for dynamic we are giving this code
		String downloadPath = System.getProperty("user.dir");
System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
//it is present in chrome options document.
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
         chromePrefs.put("download.default_directory", downloadPath);
       ChromeOptions options = new ChromeOptions();
      options.setExperimentalOption("prefs", chromePrefs);
      WebDriver driver = new ChromeDriver(options);
		driver.get("https://altoconvertpdftojpg.com/");

		driver.findElement(By.cssSelector("[class*='btn--choose']")).click();
		Thread.sleep(3000);
		// it is for pdf files
		Runtime.getRuntime().exec("D:\\selenium\\New folder\\SECTION 36-FILE UPLOADING AUTOIT\\fileload.exe");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));
		//to remember the concept
		WebElement element = driver.findElement(By.cssSelector("button[class*='medium']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));
		
		WebElement elementone = driver.findElement(By.linkText("Download Now"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",elementone);

		


		Thread.sleep(5000);
		// it is used to verify id the file is successfully downloaded or not.result.zip means it has been downloaded in this format
		File f = new File(downloadPath + "\\Result.zip");
		if (f.exists()) {
			System.out.println("file found");
			//it will accept true statement, so put the true statement inside.
			Assert.assertTrue(f.exists());
		} 
		if(f.delete())
		{
			System.out.println("file deleted");
		}

	}

}
