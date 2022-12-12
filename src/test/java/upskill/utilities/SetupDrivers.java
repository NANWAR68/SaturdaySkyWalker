 package upskill.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {
	
	public static WebDriver driver;                  //initializing driver
	
	public static void setupDriver(){
	//	System.setProperty("webdriver.chrome.driver","");
		WebDriverManager.chromedriver().setup();       //getting the chrome driver from cloud
		ChromeOptions options = new ChromeOptions();   //initializing chrome options
		options.addArguments("--start-maximized");
	    options.addArguments("--disable-notifications");
	//  options.addArguments("--headless");
	    driver = new ChromeDriver (options);          //initialize chrome driver
	    driver.get("https://www.ebay.com/");         //loading the page
	}
	
public static WebDriver getDriver(){
	return driver;
}

public static void tearDownDriver(){
	//driver.close();                               //closing current driver
	driver.quit();                                  //closing all driver
}
}
