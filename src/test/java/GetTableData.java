import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTableData {
	@Test
	public void getData() {
//	String FruitName="Apple";
//	WebDriver driver =new ChromeDriver();
//	driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	String countPrice=driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
//	String ActualPrice=driver.findElement(By.xpath("//div[text()='"+FruitName+"']/parent::div/parent::div/div[@id='cell-"+countPrice+"-undefined']")).getText();
//	System.out.println(ActualPrice);
//	String ActualPrice2=driver.findElement(By.xpath("(//div[text()='Orange'])[2]/../../div[@id='cell-"+countPrice+"-undefined']")).getText();
//	System.out.println(ActualPrice2);

		String[] FruitName = { "Apple", "Orange","Kivi","Mango","Papaya","Banana" };
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String countPrice = driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");

		 for (String fruit : FruitName) {
	            String actualPrice = driver.findElement(By.xpath(
	                "//div[text()='" + fruit + "']/parent::div/parent::div/div[@id='cell-" + countPrice + "-undefined']"
	            )).getText();

	            System.out.println(fruit + " Price = " + actualPrice);
	        }

	}
}
