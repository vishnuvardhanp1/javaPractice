/**
 * 
 */
package day35;

import java.io.*;


/**
 * 
 */
public class Program4_DeSerializatin {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Student_G student=new Student_G(101,"Ram");
			File file=new File("C:\\Users\\VISHNU VARDHAN\\Desktop\\practice.txt");
			
			FileInputStream fis=new FileInputStream(file);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Student_G student;
			try {
				student = (Student_G) ois.readObject();
				System.out.println(student.rollNo + " " + student.name);
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ois.close();
			
	}

}
