/**
 * 
 */
package seleniumday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 */
public class Program1_DropDown {

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
	    WebElement countryTag=driver.findElement(By.id("country"));
	    Select dropDown=new Select(countryTag);
	    dropDown.selectByVisibleText("Germany");
	    Thread.sleep(2000);
	    dropDown.selectByContainsVisibleText("Russia");
	    Thread.sleep(2000);
	    dropDown.selectByValue("china");
	    Thread.sleep(2000);
	    dropDown.selectByIndex(12);
	    Thread.sleep(2000);
	    
	    driver.quit();
	}

}
