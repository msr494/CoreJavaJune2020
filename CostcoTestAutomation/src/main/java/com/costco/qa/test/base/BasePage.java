package com.costco.qa.test.base;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.safari.SafariDriver;
	import org.testng.annotations.Parameters;

	import com.beust.jcommander.Parameter;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BasePage {

		WebDriver driver; //variable declared //didn't use in this page
		Properties prop;
		
		public static ThreadLocal <WebDriver> tldriver = new ThreadLocal <WebDriver> (); //single thread e run korbe
		
		public static synchronized WebDriver getDriver() { //making our web driver as thread safe (synchronized - browser one by one)
			return tldriver.get(); //get method of set method at line 42
		}

		/**
		 * this below method is used to initialize the driver on the basis of browser name
		 * 
		 * @param browser
		 * @return driver
		 */
		
		//@Parameters("browser")
	  
		
		
		public WebDriver init_driver(Properties prop) {
			String browser = prop.getProperty("browser");

			if (browser.equals("chrome")) { //String type method
				WebDriverManager.chromedriver().setup();
			
				//driver = new ChromeDriver();
				tldriver.set(new ChromeDriver());
			} else if (browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				//driver = new FirefoxDriver();
				tldriver.set(new FirefoxDriver());
			} else if (browser.equals("safari")) {
				WebDriverManager.getInstance(SafariDriver.class).setup();
				//driver = new SafariDriver();
				tldriver.set(new SafariDriver());

			} else {
				System.out.println("Please pass the correct browser name....");
			}
			getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			getDriver().manage().window().fullscreen();
			getDriver().manage().deleteAllCookies();
			
			getDriver().get(prop.getProperty("url"));
			
			return getDriver();
		}
		//command+click or cntl+click

		/**
		 * this below method is used to initialize the properties from config.properties
		 * file...
		 * 
		 * @return prop
		 */
		public Properties init_properties() {

			prop = new Properties();
			try {
				FileInputStream ip = new FileInputStream("C:\\Users\\msr49\\eclipse-workspace\\CostcoTestAutomation\\src\\main\\java\\com\\costco\\qa\\test\\config\\config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			return prop;

		}
		
		
		public String getScreenshot() {
			File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png";
			File destination = new File(path);
			try {
				FileUtils.copyFile(src, destination);
			} catch (IOException e) {
				System.out.println("Capture Failed " + e.getMessage());
			}
			return path;
		}

	}



