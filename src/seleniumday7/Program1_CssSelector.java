/**
 * 
 */
package seleniumday7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
/**
 * 
 */
public class Program1_CssSelector {

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
	    driver.findElement(By.cssSelector("#input_text")).sendKeys("Java");
	    driver.findElement(By.cssSelector("input.w-full"));
	    
	    driver.findElement(By.cssSelector("input[id='input_text']"));
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Home")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.partialLinkText("Sel")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.className("text-primary-hover")).sendKeys("PYTHON");
	}

}
