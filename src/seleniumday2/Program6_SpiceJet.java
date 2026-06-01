package seleniumday2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program6_SpiceJet {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		WebDriver driver=new ChromeDriver();
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://www.spicejet.com");
	    Thread.sleep(2000);
	    
	    driver.manage().window().fullscreen();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//div[text()='From']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[text()='From']/following::input")).sendKeys("hyd");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[text()='To']/following::input")).sendKeys("pun");
	    Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
