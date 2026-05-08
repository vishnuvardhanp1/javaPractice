/**
 * 
 */
package day34;

import java.io.*;

/**
 * 
 */
public class Program2_FileWriter {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\VISHNU VARDHAN\\Desktop\\text.txt");
		FileWriter fr =new FileWriter(file,true);
		fr.write("\n four \n five \n ");
		fr.close();
	}

}
