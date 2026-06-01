/**
 * 
 */
package seleniumday2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


/**
 * 
 */
public class Program5_DatePicker {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		WebDriver driver=new ChromeDriver();
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("http://www.oyorooms.com");
	    Thread.sleep(2000);
	    
	    driver.manage().window().fullscreen();
	   
	  /*  Thread.sleep(2000);
	    driver.findElement(By.id("date")).sendKeys("01-04-2023");*/
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[contains(@class,'datePickerDesktop--home')]")).click();
	    Thread.sleep(2000);
	    WebElement arrow=driver.findElement(By.xpath("//div[contains(@class,'DateRangePicker__PaginationArrow DateRangePicker__PaginationArrow--next')]"));
	    arrow.click();
	    Thread.sleep(2000);
	    arrow.click();
	    Thread.sleep(2000);
	    arrow.click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='DateRangePicker__DateLabel' and text()=14]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='DateRangePicker__DateLabel' and text()=18]")).click();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
