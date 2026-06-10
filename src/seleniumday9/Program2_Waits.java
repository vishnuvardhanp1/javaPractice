/**
 * 
 */
package seleniumday9;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 */
public class Program2_Waits {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	    Thread.sleep(2000);
	    driver.manage().timeouts()
	    .pageLoadTimeout(Duration.ofSeconds(5));
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://www.engineerdiaries.com/selenium");
	    Thread.sleep(2000);
	    System.out.println(driver.getTitle());
	    //implicit wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.findElement(By.id("input_text")).sendKeys("Java");
	    //explicit wait
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(14));
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("input_text")))).sendKeys("hello");
	    wait=new WebDriverWait(driver,Duration.ofSeconds(14));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text() = 'Start']"))).click();
	    wait=new WebDriverWait(driver,Duration.ofSeconds(14));
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[text() = 'Start']")))).click();
	    wait=new WebDriverWait(driver,Duration.ofSeconds(14));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id = 'input_text']"))).sendKeys("vishnu");
	    
	   
	}

}
