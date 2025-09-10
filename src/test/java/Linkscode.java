import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Linkscode {
@Test
public void BrokenLinks() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//div[text()='Elements']")).click();
	driver.findElement(By.xpath("//span[text()='Links']")).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)");
	WebElement Header = driver.findElement(By.cssSelector("#linkWrapper"));
	System.out.println(Header.findElements(By.tagName("a")).size());
	for(int i=0;i<Header.findElements(By.tagName("a")).size();i++)
	{
		String click=Keys.chord(Keys.CONTROL,Keys.ENTER);
		Header.findElements(By.tagName("a")).get(i).sendKeys(click);
		Thread.sleep(5000);
	}
	System.out.println("git checkup 1");
	System.out.println("git checkup 2");
	System.out.println("git checkup 3");
	
}
}
