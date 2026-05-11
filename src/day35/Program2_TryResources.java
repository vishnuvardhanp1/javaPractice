/**
 * 
 */
package day35;

import java.io.File;
import java.io.FileWriter;

/**
 * 
 */
public class Program2_TryResources {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\VISHNU VARDHAN\\Desktop\\text.txt");
    try(FileWriter fr =new FileWriter(file,true)) {
    	
		
		fr.write("\n four \n five \n ");
		//fr.close();
    } catch(Exception e) {
    	System.out.println(e.getMessage());
    }
	}

}
