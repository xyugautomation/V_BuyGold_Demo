package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchbrowser {
	
	public static WebDriver driver;

	@BeforeTest
	public static void setup() {

		// Setup ChromeDriver binary using WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create a new instance of the Chrome driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Open a website
		driver.get("http://52.77.24.76/");

	}






}
