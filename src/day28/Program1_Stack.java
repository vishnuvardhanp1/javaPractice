/**
 * 
 */
package day28;

import java.util.Stack;

/**
 * 
 */
public class Program1_Stack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="[][][";
    int flag=0;
    Stack<Character> stack=new Stack<Character>();
    for(int i=0;i<=str.length() - 1;i++) {
    	if(str.charAt(i)=='[') {
    		stack.push(str.charAt(i));
    	}
    	else  {
    		if(stack.isEmpty())
    		{ 
    			flag=1;
    			break;
    		}
    		else
    		{
    			stack.pop();
    		}
    	}
    }
    if(flag == 1) {
    	System.out.println("Not balanced : More Closing");
    } else if(!stack.empty()) {
    	System.out.println("Not balance : More opening");
    }
    else {
    	System.out.println("balanced");
    }
	}

}
