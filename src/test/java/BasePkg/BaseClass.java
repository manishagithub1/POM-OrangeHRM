package BasePkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Screenshot.listeners.class)
public class BaseClass {

	public static WebDriver driver;
	public static FileInputStream fp;
	public static Properties prop;

	public BaseClass() throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream(
				new File("F:\\JulyBatch\\POM-OrangeHRM\\src\\test\\java\\PropertyFiles\\config.properties")));
	}

	@BeforeSuite
	public void openBrowser() throws FileNotFoundException, IOException {
		BaseClass b = new BaseClass();

		if (prop.get("Browser").equals("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (prop.get("Browser").equals("Firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		}

		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void closeBrowser() {
		driver.quit();
	}
}
