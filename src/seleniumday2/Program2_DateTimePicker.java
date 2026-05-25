/**
 * 
 */
package seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class Program2_DateTimePicker {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://www.engineerdiaries.com/selenium");
	    Thread.sleep(2000);
	    
	    driver.manage().window().fullscreen();
	   
	    Thread.sleep(2000);
	    driver.findElement(By.id("date")).sendKeys("01-04-2023");
	    Thread.sleep(2000);
	    driver.findElement(By.tagName("textarea")).sendKeys("Today is monday");
	    Thread.sleep(2000);
	    driver.quit();
	}

}
