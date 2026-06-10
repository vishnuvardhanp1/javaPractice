/**
 * 
 */
package seleniumday9;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * 
 */
public class Program3_FluentWait {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	    Thread.sleep(2000);
	   /* driver.manage().timeouts()
	    .pageLoadTimeout(Duration.ofSeconds(5));
	    driver.manage().window().maximize();*/
	    Thread.sleep(2000);
	    driver.get("https://www.engineerdiaries.com/selenium");
	    Thread.sleep(2000);
	    WebElement startBtn=driver.findElement(By.xpath("//*[@data-testid='start-button']"));
	    startBtn.click();
	    Wait<ChromeDriver> wait1 = new FluentWait<>(driver)
	            .withTimeout(Duration.ofSeconds(15))
	            .pollingEvery(Duration.ofSeconds(2))
	            .ignoring(NoSuchElementException.class);
	    
	    wait1.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@data-testid='message-display']"), "hello"));
	    System.out.println("Text not found");
	    
	    
	}

}
