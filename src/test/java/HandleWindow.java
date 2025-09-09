import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[text()=\"Multiple Windows\"]")).click();
	driver.findElement(By.xpath("//a[text()=\"Click Here\"]")).click();
	
	Set<String> window = driver.getWindowHandles();
	
	Iterator<String> it = window.iterator();
	
	String parentId=it.next();
	
	driver.switchTo().window(parentId);
	
	System.out.println("Parent ID :"+ parentId);
	
	System.out.println(driver.findElement(By.tagName("h3")).getText());
	
	String ChildId=it.next();
	
	driver.switchTo().window(ChildId);
	
	System.out.println("Child ID :" + ChildId);
	
	System.out.println(driver.findElement(By.tagName("h3")).getText());
	
	
	
}
}
