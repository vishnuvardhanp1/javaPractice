/**
 * 
 */
package testcases;

import org.testng.annotations.Test;

/**
 * 
 */
public class LoginTest {

	@Test
	void login() {
		int num=10/0;
		System.out.println("Login");
	}
	
	@Test(dependsOnMethods ={ "login" }) 
	void logout() {
		System.out.println("Logout");
	}
	@Test(enabled=false)
	void forgetPassword() {
		
		System.out.println("Forgot Password");
	}
	
	@Test(timeOut=5000)
	void reload() throws InterruptedException {
		Thread.sleep(7000);
		System.out.println("Reload");
	}
}
