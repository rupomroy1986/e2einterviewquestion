package SeleniumProgramPractice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonInterviewQuestionExtended {

	public static void main(String[] args) throws InterruptedException {
		
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w =new WebDriverWait(driver,5);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));


		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.close();
}

	 public static void addItems(WebDriver driver, String[] itemsNeeded)
	 {
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	for (int i = 0; i <products.size(); i++) {
		
		// CUSTOmized the code
		String name = products.get(i).getText().split("-")[0];
		String formattedName=name.trim();
		System.out.println(formattedName);

		// check whether name you extracted is present in arrayList or not- it is the
		// execution process
		// convert array into array list for each search
		List itemsNeededList = Arrays.asList(itemsNeeded);

		// this is for single element
		
		
		/*if (name.contains("Cucumber")) {
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); // remember point
		}*/
		
		
		
		// this is for dynamic element by using arraylist concept. Here we are putting J because of memory management. Once it find the 3 elements, 
		//it will break and will not execute further.
		int j = 0;
		if (itemsNeededList.contains(formattedName)) {
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click(); // remember point
			/*if (j == 3) {
				break;
			}*/
			
			//here can be n number of elements in an array.so, we are adding the below code.
			
			if (j == itemsNeeded.length) {
				break;
			}

		}

	}
            
}
}