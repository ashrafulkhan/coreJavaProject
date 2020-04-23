package configProperties;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesFileTest {
	static Logger logger = LogManager.getLogger(PropertiesFileTest.class);
	WebDriver driver = null;
	public static String browserName = null;
	String	projectPath;

	@BeforeTest
	public void before() throws IOException {
       
		projectPath = System.getProperty("user.dir");
		PropertiesFile.getPropertiesReding();

		if (browserName.equalsIgnoreCase("chrome1")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", projectPath + "/driver/chromedriver");
			driver = new ChromeDriver();

		} 
		else if (browserName.equalsIgnoreCase("firefox")) {
			
			//projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", "/Users/mdislam/Documents/Eclipsess/coreJavaProject/driver/geckodriver 2");
			driver = new FirefoxDriver();
			System.out.println("Firefox driver is lunching");

		}

	}

	@Test
	public void test01() {
		System.out.println("This is firefox browser lunching using properties file: ");
	}

	@AfterTest
	public void tearDown() {

	}

}
