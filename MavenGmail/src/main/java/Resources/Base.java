package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initialiseDriver() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\HAZIRA\\MavenGmail\\src\\main\\java\\Resources\\data.properties");
		
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		System.out.println(browsername);
		
		if(browsername.equals("chrome")) {
			System.out.println("Chrome block");
			System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox")){
			System.setProperty("webdriver.firefox.marionette", "C://Selenium//geckodriver-v0.26.0-win64//geckodriver.exe");
		 driver=new FirefoxDriver();
			
		}
		else if(browsername=="ie") {
			
		}
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	

}
