/**
 * 
 */
package seleniumday9;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

/**
 * 
 */
public class Program1_RelativeLocater {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://www.engineerdiaries.com/selenium");
	    Thread.sleep(2000);
	    By python=RelativeLocator.with(By.xpath("//input[@value='python']"))
	    		.toRightOf(By.xpath("//input[@value='java']"));
	    driver.findElement(python).click();
	    
	}

}
