/**
 * 
 */
package day26;

/**
 * 
 */
public class Program1_Regex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* [] either of characters
		 * ^starts with
		 * .* containing anything
		 */
     String productCode="Amz101234";
     String productCode1="Amzon101";
     String productCode2="z101";
     String productCode3="Pz101";
     String productCode4="Amz515";
     String productCode5="Amz5";
     String regex1="^[Amz].*";
     String regex2="^Amz.*";
     String regex3="^Amz[0-9]{3}$";
     String regex4="^Amz[0-9]{3}.*";
     System.out.println(productCode.matches(regex3));
     System.out.println(productCode.matches(regex4));
     System.out.println(productCode1.matches(regex2));
     System.out.println(productCode.matches(regex2));
     System.out.println(productCode2.matches(regex2));
     System.out.println(productCode2.matches(regex1));
     System.out.println(productCode3.matches(regex1));
     
     String regex5="^Amz[0-5]{3}.*";
     System.out.println(productCode.matches(regex5));
     System.out.println(productCode4.matches(regex5));
     
     String regex6="^Amz[0-5]{2,3}$";
     System.out.println(productCode5.matches(regex6));
     System.out.println(productCode4.matches(regex6));
     productCode1="Amz101";
     String regex7=".*^Amz[0-5]{2,3}.*";
     System.out.println(productCode1.matches(regex7));
     
     
     //3-6 characters
     //_ optional
     //2 digit or 3 digit number
     //@infosys.com
     
     String email="abcDEF_123@infosys.  com";
     String regexP="^[A-Za-z]{3,6}_ ?[0-9]{2,3}@infosys.\\s+com$";
     System.out.println(email.matches(regexP));
     
     //
     /*
      * phonenumber 6-9 starts
      * 9 disgit number followed
      * 
      */
     //String regex11="^[6-9]{1}[0-9]{9}$";
     String regex11="^[6,9][0-9]{9}$";
     String phoneNumber="9674567654";
     System.out.println(phoneNumber.matches(regex11));
	}

}
