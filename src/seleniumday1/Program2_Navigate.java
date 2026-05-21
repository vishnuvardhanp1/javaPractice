package seleniumday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2_Navigate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    Thread.sleep(2000);
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.get("https://www.engineerdiaries.com/selenium");
    Thread.sleep(2000);
    driver.get("https://www.geekforgeeks.org");
    Thread.sleep(2000);
    driver.navigate().back();
    Thread.sleep(2000);
    driver.navigate().forward();
    Thread.sleep(2000);
    driver.navigate().refresh();
    Thread.sleep(2000);
    driver.quit();
	}

}
