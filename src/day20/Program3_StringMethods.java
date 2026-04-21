/**
 * 
 */
package day20;

/**
 * 
 */
public class Program3_StringMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Today is friday";
		String str2="";
		String str3=" ";
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('o'));
		System.out.println(str.isEmpty());
		System.out.println(str2.isEmpty());
		System.out.println(str2.isBlank());
		System.out.println(str3.isBlank());
		System.out.println(str3.isEmpty());
		System.out.println(str.length());
		System.out.println(str.replace(' ','-'));
		System.out.println(str.substring(0,5));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String str4="                           Today                             ";
		System.out.println(str4.stripLeading());
		System.out.println(str4.stripTrailing());
		System.out.println(str4.trim());
		System.out.println(str4.strip());
		
		String s = """
		        Hello
		          World
		        Java
		        """;
		System.out.println(s.stripIndent());
		System.out.println(s.trim());
		System.out.println(s.strip());
		
		String s1 = "\u2003hello\u2003"; // Unicode space

		System.out.println(s1.trim());   // ❌ may not remove properly
		System.out.println(s1.strip()); 
		
		String str5="hello";
		System.out.println(str5.equalsIgnoreCase("HELLO"));
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++)
			System.out.println(words[i]);
	}

}
