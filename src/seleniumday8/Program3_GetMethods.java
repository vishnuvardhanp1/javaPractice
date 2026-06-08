/**
 * 
 */
package seleniumday8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * 
 */
public class Program3_GetMethods {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		ChromeDriver driver=new ChromeDriver(opt);
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://www.engineerdiaries.com/selenium");
	    Thread.sleep(2000);
	    System.out.println(driver.getTitle());
	    Thread.sleep(2000);
	    WebElement inputBox=driver.findElement(By.id("input_text"));
	    System.out.println(inputBox.getAccessibleName());
	    System.out.println(inputBox.getAriaRole());
	    System.out.println(inputBox.getAttribute("placeholder"));
	    System.out.println(inputBox.getCssValue("font-size"));
	   // System.out.println(inputBox.getAccessibleName());
	    System.out.println(inputBox.getDomAttribute("value"));
	    System.out.println(inputBox.getDomProperty("text"));
	    System.out.println(inputBox.getTagName());
	    System.out.println(inputBox.isDisplayed());
	    System.out.println(inputBox.isEnabled());
	    System.out.println(inputBox.isSelected());
	    System.out.println(inputBox.getLocation().getX());
	    System.out.println(inputBox.getRect().getHeight());
	    System.out.println(inputBox.getClass());
	   
	}

}
