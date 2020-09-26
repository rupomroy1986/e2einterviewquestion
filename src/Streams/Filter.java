package Streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Cherry");
		//this list contains all the items.
		List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
		//in that list whether rice is present or not.
		List<WebElement> filteredList= veggies.stream().filter(veggie->veggie.getText().contains("Cherry")).collect(Collectors.toList());
		Assert.assertEquals(veggies, filteredList);
		driver.close();
		

		
		
		

	}

}
