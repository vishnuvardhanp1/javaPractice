/**
 * 
 */
package seleniumday1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class Program3_ScreenSize {

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
		    driver.manage().window().minimize();
		    Thread.sleep(2000);
		    driver.manage().window().fullscreen();
		    Thread.sleep(2000);
		    driver.manage().window().setSize(new Dimension(500,500));
		    Thread.sleep(2000);
		    driver.manage().window().setPosition(new Point(50,200));
		    WebElement inputbox=driver.findElement(By.id("input_text"));
		    		inputbox.clear();
		    		 Thread.sleep(2000);
		    inputbox.sendKeys("Java");
		    List<WebElement> genderList=(List<WebElement>) driver.findElement(By.name("gender"));
		    genderList.get(1).click();
		    Thread.sleep(2000);
		    
	}

}
