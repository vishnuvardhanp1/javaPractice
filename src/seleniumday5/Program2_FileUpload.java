/**
 * 
 */
package seleniumday5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
/**
 * 
 */
public class Program2_FileUpload {

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
	    Actions act=new Actions(driver);
	    Thread.sleep(2000);
	    WebElement fileUpload=driver.findElement(By.id("file-upload"));
	    //act.scrollToElement(fileUpload).perform();
	    Thread.sleep(2000);
	    fileUpload.sendKeys("C:\\Users\\VISHNU VARDHAN\\Desktop\\Text.txt");
	  
	    JavascriptExecutor js=driver;
	    js.executeScript(
	    		"arguments[0].scrollIntoView(true);",
	    		fileUpload);
	    js.executeScript("window.scrollBy(0,2000)");
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    Thread.sleep(2000);
	    js.executeScript("document.getElementById('input_text').value='java'");
	    Thread.sleep(2000);
	    WebElement inputText=driver.findElement(By.id("input_text"));
	    //act.scrollToElement(inputText).perform();
	    js.executeScript(
	    		"arguments[0].scrollIntoView(true);",
	    		inputText);
	}

}
