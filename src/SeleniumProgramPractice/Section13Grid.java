package SeleniumProgramPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Section13Grid {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		//int rowcount=	table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		//it is used to substract the two values
		for(int i=0;i<count-2;i++)
		{
	//System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		String value	=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int valueinteger     =Integer.parseInt(value);
		 sum=sum+valueinteger;
		 //System.out.println(sum);
}
		//System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
	String Extras	=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue=Integer.parseInt(Extras);
		//System.out.println(extrasValue);
		 int TotalSumValue = sum+extrasValue;
		  System.out.println(TotalSumValue);
		  
//System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		String ActualTotal	=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalVAlue=Integer.parseInt(ActualTotal);
		//here we are comparing the values.
		Assert.assertEquals(TotalSumValue, ActualTotalVAlue);
		driver.close();

}
}