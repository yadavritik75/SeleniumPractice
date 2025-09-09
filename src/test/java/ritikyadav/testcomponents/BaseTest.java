package ritikyadav.testcomponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import ritikYadav.pageobjects.LandingPage;

public class BaseTest {
	WebDriver driver;

	public WebDriver initializeDriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "src//test//java//Resources//globaldata.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		if (browsername.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		if (browsername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}

	@BeforeMethod
	public LandingPage launchApplication() throws IOException {
		driver = initializeDriver();
		LandingPage landingpage = new LandingPage(driver);
		landingpage.land();
		return landingpage;
	}
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
