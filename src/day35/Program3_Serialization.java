/**
 * 
 */
package day35;
import java.io.*;

/**
 * 
 */
public class Program3_Serialization {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    Student_G student=new Student_G(101,"Ram");
	File file=new File("C:\\Users\\VISHNU VARDHAN\\Desktop\\practice.txt");
	file.createNewFile();
	FileOutputStream fos=new FileOutputStream(file);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(student);
	oos.close();
	
	}

}
