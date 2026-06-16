/**
 * 
 */
package testcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * 
 */
public class ReRun implements IRetryAnalyzer{
    static int count=2;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count > 0) {
			System.out.println("Retrying .................");
			count--;
		    return true;	
		}
		else
		    return false;
	}

}
