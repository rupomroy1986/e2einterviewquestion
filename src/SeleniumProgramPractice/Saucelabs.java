package SeleniumProgramPractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Saucelabs {
	//you will get this 3 lines from the official docs for sause labs
	public static final String USERNAME = "rupom1986";
	 public static final String ACCESS_KEY = "4e264af1-e42a-40d5-bc28-063171d13765";
	 public static final  String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		
		
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		//to give the proper information, search for the sause labs configurations in google.
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "41.0");
		//here we have to connect with the sauselabs.
		WebDriver driver= new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
				
				

	}

}
