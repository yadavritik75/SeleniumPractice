package ritikYadav.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents {
	WebDriver driver;

	public AbstractComponents(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void ElementToAppear( By findBy)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement ResetButton = wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
		ResetButton.click();
	}
	
	
	public void clickElementWhenClickable(By findBy) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(findBy));
	    element.click();
	}

		
	}



