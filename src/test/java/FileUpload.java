import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUpload {
	@Test
	public void uploadFile()
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("#downloadButton")).click();
		WebElement upload = driver.findElement(By.xpath("//input[@type=\"file\"]"));
		upload.sendKeys("/Users/ritikyadav/Downloads/download.xlsx");
		//wait for success message  to show up and wait for disappear
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		 WebElement getToastMessage = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".Toastify__toast-body div:nth-child(2)"))));
		
		String message =getToastMessage.getText();
		System.out.println(message);
		Assert.assertEquals("Updated Excel Data Successfully.", message);
		
	
	}
	
}
