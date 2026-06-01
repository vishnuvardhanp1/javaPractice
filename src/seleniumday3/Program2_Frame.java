/**
 * 
 */
package seleniumday3;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 */
public class Program2_Frame {

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
	    WebElement frameTag=driver.findElement(By.tagName("iframe"));
	    driver.switchTo().frame(frameTag);
	    driver.findElement(By.name("username")).sendKeys("Java");
	}

}
