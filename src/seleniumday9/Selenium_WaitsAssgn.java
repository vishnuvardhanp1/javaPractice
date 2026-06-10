/**
 * 
 */
package seleniumday9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 */
public class Selenium_WaitsAssgn {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
	    Thread.sleep(2000);
	   /* driver.manage().timeouts()
	    .pageLoadTimeout(Duration.ofSeconds(5));
	    driver.manage().window().maximize();*/
	    Thread.sleep(2000);
	    driver.get("https://files.wiseapp.live/upload_files/6932afb3c05630afe5a997f1/upload_e8b6df31-b24c-452b-9cf7-44ccd9eed91d.html");
		// TODO Auto-generated method stub
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("foodHeading")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("category")));

 

				

		//WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cartCount")));

		System.out.println("Menu item is visible");

		 

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		 

		WebElement category=driver.findElement(By.xpath("//button[contains(text(),'Dessert')]"));

		category.click();

		 

		WebElement cart=driver.findElement(By.xpath("(//button[contains(text(),'Add to Cart')])[2]"));

		cart.click();

		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("cartCount"),"1"));

		 

		WebElement confirmBtn=driver.findElement(By.xpath("//button[@id='confirmOrderBtn']"));

		confirmBtn.click();

		driver.findElement(By.id("closePopupBtn")).click();






	}

}
