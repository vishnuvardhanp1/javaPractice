/**
 * 
 */
package seleniumday1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class Program5_Checkbox {

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
		    List<WebElement> checkboxes =
		    		driver.findElements(By.name("programmingLang"));

		    for(WebElement cb : checkboxes)
		    {
		       /* if(cb.getAttribute("value").equals("java"))
		        {
		            cb.click();
		            break;
		        }*/
		    	 cb.click();
		    	 Thread.sleep(2000);
		    }
		    Thread.sleep(2000);
		    WebElement inputbox=driver.findElement(By.id("input_text"));
 			inputbox.clear();
 			Thread.sleep(2000);
 			inputbox.sendKeys("Java");
 			Thread.sleep(2000);
 			List<WebElement> genderList= driver.findElements(By.name("gender"));
 			genderList.get(1).click();
 			Thread.sleep(2000);
		    
		    
		/*    driver.findElement(
		    		By.cssSelector("input[name='programmingLang'][value='java']")
		    		).click();
		    driver.findElement(
		    		By.cssSelector("input[name='programmingLang'][value='python']")
		    		).click();*/
		    Thread.sleep(2000);
		    driver.quit();
	}

}
