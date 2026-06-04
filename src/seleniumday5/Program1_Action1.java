/**
 * 
 */
package seleniumday5;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/**
 * 
 */
public class Program1_Action1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			WebDriver driver=new ChromeDriver();
		    Thread.sleep(2000);
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.get("https://www.engineerdiaries.com/selenium");
		    Thread.sleep(2000);
		    WebElement hover=driver.findElement(By.xpath("//*[@data-testid='hover-box']"));
		    Actions act=new Actions(driver);
		    act.moveToElement(hover).build().perform();
		    Thread.sleep(2000);
		    WebElement rightClick=driver.findElement(By.xpath("//*[@data-testid='right-click-box']"));
		    act.contextClick(rightClick).build().perform();
		    Thread.sleep(2000);
		    WebElement doubleClick=driver.findElement(By.xpath("//*[@data-testid='double-click-box']"));
		    act.doubleClick(doubleClick).build().perform();
		    Thread.sleep(2000);
		    WebElement draggable=driver.findElement(By.id("draggable"));
		    WebElement droppable=driver.findElement(By.xpath("//*[contains(text(),'Drop here')]"));
		    act.dragAndDrop(draggable, droppable).build().perform();
		    Thread.sleep(2000);
		    WebElement inputBox=driver.findElement(By.id("input_text"));
		    act.scrollToElement(driver.findElement(By.xpath("//*[text()='Start']")));
		    Thread.sleep(8000);
		    act.keyDown(Keys.SHIFT).build().perform();
		    inputBox.clear();
		    Thread.sleep(1000);
		    inputBox.sendKeys("hello");
		    act.keyUp(Keys.SHIFT).build().perform();
		    inputBox.sendKeys("bye");
		    
		    
	} catch(Exception e) {
		e.printStackTrace();
	}
	}
}
