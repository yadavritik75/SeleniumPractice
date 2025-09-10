import java.time.Duration;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Buttons {
@Test
public void ButtonCode()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//div[text()='Elements']")).click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement ButtonTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Buttons']")));
	ButtonTab.click();
	WebElement FirstButton = driver.findElement(By.cssSelector("#doubleClickBtn"));
	Actions action=new Actions(driver);
	action.moveToElement(FirstButton).doubleClick().perform();
	String confirmation1 = driver.findElement(By.cssSelector("#doubleClickMessage")).getText();
	System.out.println(confirmation1);
	WebElement secondButton = driver.findElement(By.cssSelector("#rightClickBtn"));
	action.moveToElement(secondButton).contextClick(secondButton).perform();
	WebElement confirmation2 = driver.findElement(By.xpath("//p[text()='You have done a right click']"));
	String confrimText = confirmation2.getText();
	Assert.assertEquals(confrimText,"You have done a right click");
	
	
	
	
	
}
}
