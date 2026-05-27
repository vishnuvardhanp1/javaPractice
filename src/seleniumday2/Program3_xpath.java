/**
 * 
 */
package seleniumday2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
/**
 * 
 */
public class Program3_xpath {

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
	    List<WebElement> headingList=driver.findElements(By.xpath("//tr/th"));
	   for(WebElement heading : headingList) {
		   System.out.println(heading.getText()+ " ");
		   
	   }
	   Thread.sleep(2000);
	   List<WebElement> row5=driver.findElements(By.xpath("//tr[@data-testid='row-5']//td"));
	   for(int i=1;i<=row5.size()-1;i++) {
		   System.out.println(row5.get(i).getText()+ " ");
	   }
	   
	   Thread.sleep(2000);
	   for(int i=2;i<=row5.size();i++) { 
	   WebElement element=driver.findElement(By.xpath("//tr[@data-testid='row-5']//td["+i+"]"));
	   System.out.println(element.getText()+ " ");
	   }
	   Thread.sleep(2000);
	   List<WebElement> reportIds =
			   driver.findElements(By.xpath("//table/descendant::tr/td[4]"));

			   for(WebElement id : reportIds)
			   {
			       System.out.println(id.getText());
			   }
	  
	   
	}

}
