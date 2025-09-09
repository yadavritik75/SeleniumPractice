import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebTables {
@Test
public void getTableData()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//div[text()='Elements']")).click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement clickTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Web Tables']")));
	clickTab.click();
	WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Type to search']")));
	search.sendKeys("Kierra");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)");
	List<WebElement> options = driver.findElements(By.xpath("//div[@class='rt-tr -odd']"));
	//options.stream().map(s->s.getText()).filter(s->!s.isEmpty()).forEach(System.out::println); 
	/*for(WebElement option :options)
	{
		System.out.println(option.getText());
	}*/
	for(WebElement option :options)
	{
		if(option.getText().equalsIgnoreCase("kierra@example.com"))
				{	
			System.out.println(option.getText());
				}
	}
		
	
}
}
