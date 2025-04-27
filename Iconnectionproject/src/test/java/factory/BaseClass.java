package factory;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	static WebDriver driver;
	static Properties p;
	static Logger Logger;

	public static Properties getProperties() throws IOException {
		FileReader file = new FileReader(System.getProperty("user.dir") + "/src/test/resources/config.properties");
		p = new Properties();
		p.load(file);
		return p;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebDriver initilizeBrowser() throws IOException {
		p = getProperties();
		String executionEnv = p.getProperty("execution_env");
		String browser = p.getProperty("browser").toLowerCase();
		// String os = p.getProperty("os").toLowerCase();
       if(executionEnv.equalsIgnoreCase("local")) {
	
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("No matching browser....");
			driver = null;
		}
       }
         driver.manage().deleteAllCookies();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	     
	return driver;
	}

	public static Logger getLogger() {
		Logger = LogManager.getLogger();// log4j
		return Logger;

	}
}
