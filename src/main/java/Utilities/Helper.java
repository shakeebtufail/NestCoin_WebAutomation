package Utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helper {
	
	public static WebDriver driver;
	public static Properties prop;
	static String propFileName = "config.properties";
	public String browser;
	public String url;
	static String projectPath = System.getProperty("user.dir");
	
public Helper() throws IOException {
		
		prop = new Properties();
		
		InputStream inputStream;
		inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
		 
		if (inputStream != null) {
			prop.load(inputStream);
		} else {
			throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
		}
		browser = prop.getProperty("browser");
		url = prop.getProperty("url");
		
//		String propFileName = 
//		FileInputStream fis = new FileInputStream(projectPath+"/src/main/java/Config/config.properties");
//		prop.load(fis);
		
	}
	
	
	
	public WebDriver initialization(String browser, String url){
		
		if (browser.contentEquals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chrome/chromedriver.exe");	
			driver = new ChromeDriver(); 
		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get(url);
			return driver;
		}
		
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", projectPath+"/driver/firefox/geckodriver.exe");	
			driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get(url);
			return driver;
		}
		
		else throw new RuntimeException("driver not added to directory.");

	}

}
