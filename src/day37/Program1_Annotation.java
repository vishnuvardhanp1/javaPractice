/**
 * 
 */
package day37;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface gsit {
	String batchCode() default "2026";
}

class Demo {
	protected static String demoId;
@gsit(batchCode="Feb 2026")
void getData() {
	
}
}
/**
 * 
 */
public class Program1_Annotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Class<Demo> obj= Demo.class;
        Field[] variables=obj.getDeclaredFields();
        for(Field  f:variables) {
        	System.out.println(f.getName());
        	int modifiers=f.getModifiers();
        	System.out.println(Modifier.toString(modifiers));
        }
        Method[] methods=obj.getDeclaredMethods();
        for(Method method:methods) {
        	System.out.println(method.getName());
        	gsit annotation = (gsit) method.getAnnotation(gsit.class);

            System.out.println( annotation.batchCode());
            
        }
        
	}

}
