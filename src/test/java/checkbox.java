import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkbox {
@Test
public void SelectCheckBoxes()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//div[text()='Elements']")).click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement CheckBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Check Box'])[1]")));
	CheckBox.click();
	WebElement Expand = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".rct-icon.rct-icon-expand-all")));
	Expand.click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,400)");
	driver.findElement(By.xpath("//span[text()='Home']")).click();
	List<WebElement> options = driver.findElements(By.cssSelector(".display-result.mt-4"));
	for(WebElement option :options)
	{
		boolean text;
		if(text=option.getText().contains("desktop"))
		{
			Assert.assertTrue(text, "desktop");
			System.out.println(text);
		}
	}
	driver.findElement(By.xpath("(//*[text()='Radio Button'])[1]")).click();
	WebElement SelectRadio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Yes'])[1]")));
	SelectRadio.click();
	
	
	
	
	
	
	
	
}
}
