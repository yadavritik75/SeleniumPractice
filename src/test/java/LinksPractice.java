import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Count all links on the page
        System.out.println("All links: " + driver.findElements(By.tagName("a")).size());

        // Footer links
        WebElement footerArea = driver.findElement(By.id("gf-BIG"));
        System.out.println("Footer links: " + footerArea.findElements(By.tagName("a")).size());

        // Column links
        WebElement columnDriver = footerArea.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        List<WebElement> links = columnDriver.findElements(By.tagName("a"));

        for (int i = 0; i < links.size(); i++) {
            String openInNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            links.get(i).sendKeys(openInNewTab);
            Thread.sleep(5000);
        }

        // Handle all opened tabs
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();

        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

        driver.quit();
    }
}
