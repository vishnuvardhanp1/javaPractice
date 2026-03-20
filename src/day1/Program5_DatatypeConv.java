/**
 * 
 */
package day1;

/**
 * 
 */
public class Program5_DatatypeConv {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upcasting implicit
      int age=32;
      float ageFloat=(float)age;
      System.out.println(" int converted float : "+ageFloat);
      //up casting
      int num=100;
      long numLong= num;
      System.out.println(" int converted long : "+numLong);
      
      //explicit conversion downcasting it will lose values
      
      float height=162.5F;
      int heightInt=(int) height;
      System.out.println(" float converted int : "+heightInt);
      //downcasting lost long to new value
      long phoneNumber=923456789123L;
      int phnoInt=(int)phoneNumber;
      System.out.println(" long converted int : "+phnoInt);
      
      
      //cannot be done
    /*  boolean result=false;
      int resultInt=int(result); */
      
	}

}
