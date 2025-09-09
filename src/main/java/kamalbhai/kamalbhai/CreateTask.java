package kamalbhai.kamalbhai;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hhhhteams.sharepoint.com/sites/HHHH/SP/SitePages/CreateTask.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ritik.yadav@hochhuth-consulting.de");
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1z*G4m85a");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='idSIButton9']")));

		element.click();
		WebElement Signin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='idSIButton9']")));
		Signin.click();

		String Title = driver.getTitle();
		System.out.println("Title of the page is : " + Title);
		WebElement EnterTaskNamee = driver.findElement(By.xpath("//input[@placeholder='Enter task Name']"));
		EnterTaskNamee.sendKeys("Test Task Automation");

		WebElement taskURl = driver.findElement(By.xpath("//input[@placeholder='Enter task Url']"));
		taskURl.sendKeys("https://hhhhteams.sharepoint.com/sites/HHHH/SP/SitePages/CreateTask.aspx");

		WebElement selectComponent = driver.findElement(By.xpath("//span[@title='Component Popup']"));
		selectComponent.click();

		WebElement TitleSearch = driver.findElement(By.xpath("(//input[@class='m-1'])[2]"));
		TitleSearch.sendKeys("Add and Connect Tool");

		WebElement CheckBox = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='form-check-input cursor-pointer']")));

		CheckBox.click();

		WebElement OkButton = driver.findElement(By.xpath("//*[@class='btn btn-primary me-1']"));
		OkButton.click();

		WebElement SelectProject = driver.findElement(By.xpath("(//span[@title='Component Popup'])[2]"));
		SelectProject.click();
		WebElement TitleSearch1 = driver.findElement(By.xpath("(//input[@class='m-1'])[2]"));
		TitleSearch1.sendKeys("QA Automation");

		WebElement ProjectCheckBox = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='form-check-input cursor-pointer']")));
		ProjectCheckBox.click();

		WebElement OkButton1 = driver.findElement(By.xpath("//*[@class='btn btn-primary me-1']"));
		OkButton1.click();

		WebElement TypeCategory = driver.findElement(By.xpath("//*[text()=\"Bug\"]"));
		TypeCategory.click();

		WebElement PriorityRank = driver.findElement(By.xpath("(//*[@class=\"subcategoryTask\"])[1]"));
		PriorityRank.click();

		WebElement Time = driver.findElement(By.xpath("//*[text()='Very Quick']"));
		Time.click();

		WebElement DueDate = driver.findElement(By.xpath("//*[@id='ThisMonth']"));
		DueDate.click();

		WebElement SubmitButton = driver.findElement(By.xpath("//*[text()='Submit']"));
		SubmitButton.click();

		WebElement submit = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary mx-1 px-3']")));
		submit.click();

		driver.findElement(By.xpath("//a[@title='Edit']")).click();

		driver.findElement(By.xpath("//span[text()='Delete This Item']")).click();

		driver.findElement(By.xpath("//button[text()='Yes Delete it !']")).click();
	}

}
