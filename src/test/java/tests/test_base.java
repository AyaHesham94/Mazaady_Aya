package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Pages.page_base;
import utilities.helper;

public class test_base {

	public static WebDriver driver;

	page_base PageBaseobj;
	
	@BeforeTest
	@Parameters({ "browser" })
	
	public void StartDriver(@Optional("chrome") String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/WebDriver/chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/WebDriver/geckodriver.exe");
			driver = new FirefoxDriver();
			
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/WebDriver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}

		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://staging.mazaady.com/login");
	}

	@AfterTest
	public void StopDriver() {
		driver.quit();
	}

	// Take screenshot when test case fail and add it to the Screenshot folder
	@AfterMethod
	public void screenshotOnFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed");
			System.out.println("Taking screenshoot.....");
			helper.CaptureScreenshot(driver, result.getName());
		}
	}
}
