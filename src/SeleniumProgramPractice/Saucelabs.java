package SeleniumProgramPractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Saucelabs {
	public static final String USERNAME = "rahul2";
	 public static final String ACCESS_KEY = "3234163f-d79b-44db-9be9-4ad5163147b";
	 public static final  String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		
		
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 7");
		caps.setCapability("version", "51.0");
		WebDriver driver= new RemoteWebDriver(new URL(URL), caps);
		driver.get("www.google.com");
		System.out.println(driver.getTitle());
				
				

	}

}
