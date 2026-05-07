/**
 * 
 */
package day33;
import java.io.*;
/**
 * 
 */
public class Program7_ReadingFile {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\VISHNU VARDHAN\\Desktop\\text.txt");
    FileReader fr=new FileReader(file);
    BufferedReader br=new BufferedReader(fr);
    String st="";
    while((st=br.readLine())!=null) {
    System.out.println(st);
	}
	br.close();
	}

}
