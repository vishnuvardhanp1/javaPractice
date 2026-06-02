/**
 * 
 */
package seleniumday4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class Program1_Frame {

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
	    WebElement outerFrame=driver.findElement(By.id("outer"));
	    driver.switchTo().frame(outerFrame);
	    Thread.sleep(2000);
	    WebElement innerFrame=driver.findElement(By.id("inner"));
	    driver.switchTo().frame(innerFrame);
	    Thread.sleep(2000);
	    driver.findElement(By.id("input2")).sendKeys("INNER");
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    driver.findElement(By.id("input1")).sendKeys("OUTER");
	    driver.switchTo().defaultContent();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@value='java']")).click();
	    
	}

}
