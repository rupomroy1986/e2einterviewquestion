package SeleniumProgramPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\Resources\\data.properties");
		prop.load(fis);
		 String browser   = prop.getProperty("browser");
		 System.out.println(browser);
		 System.out.println(prop.getProperty("url"));

		 prop.setProperty("browser", "firefox");

		 System.out.println(prop.getProperty("browser"));
		 //as it is used to update the details in properties file
		 FileOutputStream fos =new FileOutputStream(System.getProperty("user.dir")+"\\src\\Resources\\data.properties");
		//As we dont have any comments to pass, so we make it as null
		   prop.store(fos, "added the values");      
		
		
		

	}

}
