package SeleniumProgramPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CollectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//it is for ascending order-means one click button 
		//but for descending order=means single click button
		//driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		List<WebElement> firstColList= driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
        ArrayList<String> originalList=new ArrayList<String>();
		 for(int i=0;i<firstColList.size();i++)
		 {
			System.out.println(firstColList.get(i).getText());
			originalList.add(firstColList.get(i).getText());
		 }
		 ArrayList<String> copiedList=new ArrayList<String>();
		 for(int i=0;i<originalList.size();i++)
		 {
			 copiedList.add(originalList.get(i));
		 }
		 System.out.println("************copied list sorting***********");
		           //it is for ascending order.
		           Collections.sort(copiedList);
		           //it is for descending order
		           Collections.reverse(copiedList);
		           for(String s1 :copiedList)
		           {
		        	   System.out.println(s1);
		           }
		           System.out.println("************original list***********");
		           for(String s2 :originalList)
		           {
		        	   System.out.println(s2);
		           }
		              Assert.assertTrue(originalList.equals(copiedList));
                      driver.close();
	}

}
