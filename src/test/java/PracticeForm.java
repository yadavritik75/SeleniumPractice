import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PracticeForm {
@Test
public void Form() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ritik");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Yadav");
	driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("honeyritik05@gmail.com");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	WebElement radioButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='gender-radio-1']")));
	radioButton.click();
	driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9988776655");  
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,400)");
	driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	Thread.sleep(3000);
	
	WebElement month=driver.findElement(By.cssSelector(".react-datepicker__month-select"));
	Select select=new Select(month);
	select.selectByVisibleText("May");
	WebElement year=driver.findElement(By.cssSelector(".react-datepicker__year-select"));
	Select select1=new Select(year);
	select1.selectByVisibleText("2024");
	driver.findElement(By.xpath("(//div[text()='1'])[1]")).click();
	WebElement subject = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#subjectsInput"))));
	subject.sendKeys("PCM");
	driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
	driver.findElement(By.id("uploadPicture")).sendKeys("/Users/ritikyadav/Downloads/test.doc");
	driver.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("Greater Noida");
	js.executeScript("window.scrollBy(400,800)");
	driver.findElement(By.xpath("//button[@id='submit']")).click();
	driver.navigate().refresh();
	js.executeScript("window.scrollTo(0, 0)");

}
}
