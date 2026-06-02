/**
 * 
 */
package seleniumday4;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class Program2_AlertBox {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		try {
				WebDriver driver=new ChromeDriver();
			    Thread.sleep(2000);
			    driver.manage().window().maximize();
			    Thread.sleep(2000);
			    driver.get("https://www.engineerdiaries.com/selenium");
			    Thread.sleep(2000);
			    driver.findElement(By.id("alert")).click();
			    Thread.sleep(2000);
			    Alert alert=driver.switchTo().alert();
			    System.out.println(alert.getText());
			    alert.accept();
			    driver.findElement(By.id("confirm")).click();
			    Thread.sleep(2000);
			    Alert confirm=driver.switchTo().alert();
			    System.out.println(confirm.getText());
			    confirm.dismiss();
			    Thread.sleep(2000);
			    driver.findElement(By.id("prompt")).click();
			    Thread.sleep(2000);
			    Alert prompt=driver.switchTo().alert();
			    prompt.sendKeys("Vishnuvardhan");
			    Thread.sleep(2000);
			    System.out.println(prompt.getText());
			    prompt.accept();
			    Thread.sleep(2000);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
